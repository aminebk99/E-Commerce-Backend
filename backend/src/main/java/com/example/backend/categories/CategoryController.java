package com.example.backend.categories;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/category")
@RequiredArgsConstructor
public class CategoryController {
    private final CategoryService categoryService;

    @PostMapping
    public Category saveCategory(@RequestBody Category category){
        return categoryService.saveCategories(category);
    }
    @GetMapping
    public List<Category> listOfCategories(){
        return categoryService.listOfCategories();
    }
    @GetMapping("/{id}")
    public Optional<Category> categoryById(@PathVariable Long id){
        return categoryService.findCategoryById(id);
    }
    @DeleteMapping("/{id}")
    public void deleteCategory(@PathVariable Long id){
        categoryService.deleteCategoryById(id);
    }
}

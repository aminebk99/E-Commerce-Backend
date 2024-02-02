package com.example.backend.categories;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CategoryService {
    private final CategoryRepository categoryRepository;

    public Category saveCategories(Category category){
        return categoryRepository.save(category);
    }
    public List<Category> listOfCategories(){
        return categoryRepository.findAll();
    }
    public Optional<Category> findCategoryById(Long id){
        return categoryRepository.findById(id);
    }
    public void deleteCategoryById(Long id){
        categoryRepository.deleteById(id);
    }


}

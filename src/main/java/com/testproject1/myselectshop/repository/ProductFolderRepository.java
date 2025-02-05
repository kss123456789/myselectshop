package com.testproject1.myselectshop.repository;

import com.testproject1.myselectshop.entity.Folder;
import com.testproject1.myselectshop.entity.Product;
import com.testproject1.myselectshop.entity.ProductFolder;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductFolderRepository extends JpaRepository<ProductFolder, Long> {

    Optional<ProductFolder> findByProductAndFolder(Product product, Folder folder);
}

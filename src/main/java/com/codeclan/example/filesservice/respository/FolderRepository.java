package com.codeclan.example.filesservice.respository;

import com.codeclan.example.filesservice.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {
}

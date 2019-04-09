package com.codeclan.example.filesservice.respository;

import com.codeclan.example.filesservice.models.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long> {
}

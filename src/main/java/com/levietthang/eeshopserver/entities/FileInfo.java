package com.levietthang.eeshopserver.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Date;

@Entity(name = "file_info")
@Table(name = "file_info", indexes = {@Index(name = "EMP_FILE_INFO_INDEX", columnList = "id, filePath")})
public class FileInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "file_id_seq")
    @SequenceGenerator(name="file_id_seq", sequenceName="file_id_seq", allocationSize=1)
    private int id;

    @Column(unique = true)
    @NotNull
    private String fileName;

    @Column
    @NotNull
    private String filePath;

    @Column
    private Date createAt;

    @Column
    private double fileSize;

    public FileInfo() {
    }

    public FileInfo(@NotNull String fileName, @NotNull String filePath, Date createAt, double fileSize) {
        this.fileName = fileName;
        this.filePath = filePath;
        this.createAt = createAt;
        this.fileSize = fileSize;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public double getFileSize() {
        return fileSize;
    }

    public void setFileSize(double fileSize) {
        this.fileSize = fileSize;
    }
}

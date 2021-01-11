package com.ecom.AmShop.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import java.io.IOException;
import java.util.Base64;

@Data
@Entity
@Table(name = "image")
public class Images {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name ="image_id")
    private int image_id;

    @Lob
    @Column(columnDefinition = "MEDIUMBLOB", name = "actual_image")
    private String actual_image;


    public void setImage(MultipartFile file, Product product)
    {
        String fileName = StringUtils.cleanPath(file.getOriginalFilename());
        try {
            this.actual_image = Base64.getEncoder().encodeToString(file.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @JsonBackReference
    @ManyToOne(cascade= {CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH, CascadeType.REFRESH}, fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    private Product product;

}

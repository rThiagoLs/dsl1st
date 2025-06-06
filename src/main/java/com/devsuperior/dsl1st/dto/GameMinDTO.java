package com.devsuperior.dsl1st.dto;

import com.devsuperior.dsl1st.entities.Game;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class GameMinDTO {

        private Long id;
        private String title;
        private Integer year;
        private String imgUrl;
        private String shortDescription;

        public GameMinDTO(){
        }

        public GameMinDTO(Game entity) {
            id = entity.getId();
            title = entity.getTitle();
            year = entity.getYear();
            imgUrl = entity.getImgUrl();
            shortDescription = entity.getShortDescription();
        }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }
}


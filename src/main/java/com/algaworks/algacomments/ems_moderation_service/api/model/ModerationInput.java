package com.algaworks.algacomments.ems_moderation_service.api.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ModerationInput {
    private String commentId;        //UUID
    private String text;
}

package com.bitsmad.Lovable_Clone.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "plans")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Plan {
    long id;
    String name;
    String stripePriceId;
    Integer maxProjects;
    Integer maxTokensPerDay;    //Max Tokens per day allowed to generate
    Integer maxPreviews;    //Max Previews allowed 
    Boolean unlimitedAi;    //Unlimited Access to LLM, ignore maxTokensPerDay if true
    Boolean active;         //Active Plan
}

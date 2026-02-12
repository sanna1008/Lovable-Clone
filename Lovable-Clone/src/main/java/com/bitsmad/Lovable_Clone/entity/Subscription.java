package com.bitsmad.Lovable_Clone.entity;

import java.time.Instant;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Subscription {
    Long id;
    User user;
    Plan plan;
    String stripeCustomerId;
    String stripeSubscriptionId;
    SubscriptionStatus status;
    Instant currentPeriodStart;
    Instant currentPeriodEnd;
    Boolean cancelAtPeriodEnd=false;
    Instant createdAt;
    Instant updatedAt;
    
}
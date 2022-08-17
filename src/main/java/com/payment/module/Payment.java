package com.payment.module;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.transaction.Transactional;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "payment_details")
@Transactional
public class Payment 
{
    @Id
    private long id;
    private boolean isCompleted;
    private double amount;
    private long orderId;
}

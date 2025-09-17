package com.jungchongmu.income_service.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Getter
@Builder
@NoArgsConstructor @AllArgsConstructor
@Table(name="products")
public class Income {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id", nullable = false)
    private int product_id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="account_id", nullable = false)
    private Accounts account_id;

    @Column(name="type", nullable = false)
    @Enumerated(EnumType.STRING)
    private TransactionType type;

    @Column(name="event", nullable = false)
    private String event;

    @Column(name="date", nullable = false)
    private Date date;

    @Column(name="putchase_time")
    private Date purchase_time;

    @Column(name="pose")
    private String pose;

    @Column(name="product_name")
    private String product_name;

    @Column(name="unit", nullable = false)
    private int unit;

    @Column(name="price", nullable = false)
    private int price;

    @Column(name="payment")
    private String payment;

    @Column(name="proof", nullable = false)
    private boolean proof;

    @Column(name="adjust_time", nullable = false)
    private LocalDateTime adjust_time;

    @Column(name="delete", nullable = false)
    private boolean delete;

    @Column(name="receipt")
    private String receipt;
}
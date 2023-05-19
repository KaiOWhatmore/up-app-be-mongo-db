package com.up.upappbemongodb;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "transactions")
public class TransactionsVerbose {

    @Id
    private String documentId;

    private String type;

    @JsonProperty("transactionId")
    private String id;

    private Attributes attributes;

    private Relationships relationships;

    private Links links;


    @Getter
    @Setter
    public static class Attributes {
        private String status;
        private String rawText;
        private String description;
        private String message;
        private boolean isCategorizable;
        private Object holdInfo;
        private Object roundUp;
        private Object cashback;
        private Amount amount;
        private Object foreignAmount;
        private Object cardPurchaseMethod;
        private String settledAt;
        private String createdAt;
    }

    @Getter
    @Setter
    public static class Amount {
        private String currencyCode;
        private String value;
        private int valueInBaseUnits;
    }

    @Getter
    @Setter
    public static class Relationships {
        private Account account;
        private Object transferAccount;
        private Category category;
        private Object parentCategory;
        private Tags tags;
    }

    @Getter
    @Setter
    public static class Account {
        private Data data;
        private Links links;
    }

    @Getter
    @Setter
    public static class Category {
        private Data data;
        private Links links;
    }

    @Getter
    @Setter
    public static class Tags {
        private Object[] data;
        private Links links;
    }

    @Getter
    @Setter
    public static class Data {
        private String type;
        private String id;
    }

    @Getter
    @Setter
    public static class Links {
        private String self;
    }
}

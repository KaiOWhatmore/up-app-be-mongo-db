package com.up.upappbemongodb.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Arrays;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "transactions")
public class TransactionsCurt {
    @Id
    private String id;

    @Field("runningTotalDouble")
    private Double runningTotalDouble;

    @Field("runningTotalInteger")
    private Integer runningTotalInteger;

    @Field("type")
    private String transactionType;

    @Field("id")
    private String transactionId;

    @Field("attributes.status")
    private String status;

    @Field("attributes.rawText")
    private String rawText;

    @Field("attributes.description")
    private String description;

    @Field("attributes.message")
    private String message;

    @Field("attributes.isCategorizable")
    private boolean isCategorizable;

    @Field("attributes.holdInfo")
    private String holdInfo;

    @Field("attributes.roundUp")
    private String roundUp;

    @Field("attributes.cashback")
    private String cashback;

    @Field("attributes.amount.currencyCode")
    private String currencyCode;

    @Field("attributes.amount.value")
    private String value;

    @Field("attributes.amount.valueInBaseUnits")
    private int valueInBaseUnits;

    @Field("attributes.foreignAmount")
    private String foreignAmount;

    @Field("attributes.cardPurchaseMethod")
    private String cardPurchaseMethod;

    @Field("attributes.settledAt")
    private String settledAt;

    @Field("attributes.createdAt")
    private String createdAt;

    @Field("relationships.account.data.id")
    private String accountId;

    @Field("relationships.transferAccount.data")
    private String transferAccountId;

    @Field("relationships.category.data")
    private String categoryId;

    @Field("relationships.parentCategory.data")
    private String parentCategoryId;

    @Field("relationships.tags.data")
    private String[] tagIds;

    @Field("links.self")
    private String selfLink;

    // Constructors, getters, and setters

    @Override
    public String toString() {
        return "Transaction{" +
                "id='" + id + '\'' +
                ", transactionType='" + transactionType + '\'' +
                ", transactionId='" + transactionId + '\'' +
                ", status='" + status + '\'' +
                ", rawText='" + rawText + '\'' +
                ", description='" + description + '\'' +
                ", message='" + message + '\'' +
                ", isCategorizable=" + isCategorizable +
                ", holdInfo='" + holdInfo + '\'' +
                ", roundUp='" + roundUp + '\'' +
                ", cashback='" + cashback + '\'' +
                ", currencyCode='" + currencyCode + '\'' +
                ", value='" + value + '\'' +
                ", valueInBaseUnits=" + valueInBaseUnits +
                ", foreignAmount='" + foreignAmount + '\'' +
                ", cardPurchaseMethod='" + cardPurchaseMethod + '\'' +
                ", settledAt='" + settledAt + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", accountId='" + accountId + '\'' +
                ", transferAccountId='" + transferAccountId + '\'' +
                ", categoryId='" + categoryId + '\'' +
                ", parentCategoryId='" + parentCategoryId + '\'' +
                ", tagIds=" + Arrays.toString(tagIds) +
                ", selfLink='" + selfLink + '\'' +
                '}';
    }
}

# org.openapitools.client - Kotlin client library for Bank Account API

## Requires

* Kotlin 1.4.30
* Gradle 6.8.3

## Build

First, create the gradle wrapper script:

```
gradle wrapper
```

Then, run:

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in OpenAPI definitions.
* Implementation of ApiClient is intended to reduce method counts, specifically to benefit Android targets.

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *http://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AccountApi* | [**accountDelete**](docs/AccountApi.md#accountdelete) | **DELETE** /account | Delete an account
*AccountApi* | [**accountGet**](docs/AccountApi.md#accountget) | **GET** /account | Get all accounts
*AccountApi* | [**accountPost**](docs/AccountApi.md#accountpost) | **POST** /account | Create a new account
*CurrencyApi* | [**currencyGet**](docs/CurrencyApi.md#currencyget) | **GET** /currency | Get all currencies
*TransactionApi* | [**transactionDelete**](docs/TransactionApi.md#transactiondelete) | **DELETE** /transaction | Delete a transaction
*TransactionApi* | [**transactionGet**](docs/TransactionApi.md#transactionget) | **GET** /transaction | Get all transactions
*TransactionApi* | [**transactionPost**](docs/TransactionApi.md#transactionpost) | **POST** /transaction | Create a new transaction
*TransactionApi* | [**transactionPut**](docs/TransactionApi.md#transactionput) | **PUT** /transaction | Update a transaction


<a name="documentation-for-models"></a>
## Documentation for Models

 - [org.openapitools.client.models.Account](docs/Account.md)
 - [org.openapitools.client.models.Currency](docs/Currency.md)
 - [org.openapitools.client.models.Transaction](docs/Transaction.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

All endpoints do not require authorization.

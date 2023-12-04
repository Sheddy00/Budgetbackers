# TransactionApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**transactionDelete**](TransactionApi.md#transactionDelete) | **DELETE** /transaction | Delete a transaction
[**transactionGet**](TransactionApi.md#transactionGet) | **GET** /transaction | Get all transactions
[**transactionPost**](TransactionApi.md#transactionPost) | **POST** /transaction | Create a new transaction
[**transactionPut**](TransactionApi.md#transactionPut) | **PUT** /transaction | Update a transaction


<a name="transactionDelete"></a>
# **transactionDelete**
> Transaction transactionDelete(transaction)

Delete a transaction

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TransactionApi()
val transaction : Transaction =  // Transaction | 
try {
    val result : Transaction = apiInstance.transactionDelete(transaction)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TransactionApi#transactionDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TransactionApi#transactionDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transaction** | [**Transaction**](Transaction.md)|  |

### Return type

[**Transaction**](Transaction.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="transactionGet"></a>
# **transactionGet**
> kotlin.collections.List&lt;Transaction&gt; transactionGet()

Get all transactions

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TransactionApi()
try {
    val result : kotlin.collections.List<Transaction> = apiInstance.transactionGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TransactionApi#transactionGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TransactionApi#transactionGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.collections.List&lt;Transaction&gt;**](Transaction.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="transactionPost"></a>
# **transactionPost**
> Transaction transactionPost(transaction)

Create a new transaction

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TransactionApi()
val transaction : Transaction =  // Transaction | 
try {
    val result : Transaction = apiInstance.transactionPost(transaction)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TransactionApi#transactionPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TransactionApi#transactionPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transaction** | [**Transaction**](Transaction.md)|  |

### Return type

[**Transaction**](Transaction.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="transactionPut"></a>
# **transactionPut**
> Transaction transactionPut(transaction)

Update a transaction

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TransactionApi()
val transaction : Transaction =  // Transaction | 
try {
    val result : Transaction = apiInstance.transactionPut(transaction)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TransactionApi#transactionPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TransactionApi#transactionPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transaction** | [**Transaction**](Transaction.md)|  |

### Return type

[**Transaction**](Transaction.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


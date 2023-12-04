# AccountApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**accountDelete**](AccountApi.md#accountDelete) | **DELETE** /account | Delete an account
[**accountGet**](AccountApi.md#accountGet) | **GET** /account | Get all accounts
[**accountPost**](AccountApi.md#accountPost) | **POST** /account | Create a new account


<a name="accountDelete"></a>
# **accountDelete**
> Account accountDelete(account)

Delete an account

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AccountApi()
val account : Account =  // Account | 
try {
    val result : Account = apiInstance.accountDelete(account)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountApi#accountDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountApi#accountDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account** | [**Account**](Account.md)|  |

### Return type

[**Account**](Account.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="accountGet"></a>
# **accountGet**
> kotlin.collections.List&lt;Account&gt; accountGet()

Get all accounts

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AccountApi()
try {
    val result : kotlin.collections.List<Account> = apiInstance.accountGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountApi#accountGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountApi#accountGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.collections.List&lt;Account&gt;**](Account.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="accountPost"></a>
# **accountPost**
> Account accountPost(account)

Create a new account

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AccountApi()
val account : Account =  // Account | 
try {
    val result : Account = apiInstance.accountPost(account)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountApi#accountPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountApi#accountPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account** | [**Account**](Account.md)|  |

### Return type

[**Account**](Account.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


# CurrencyApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**currencyGet**](CurrencyApi.md#currencyGet) | **GET** /currency | Get all currencies


<a name="currencyGet"></a>
# **currencyGet**
> kotlin.collections.List&lt;Currency&gt; currencyGet()

Get all currencies

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CurrencyApi()
try {
    val result : kotlin.collections.List<Currency> = apiInstance.currencyGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CurrencyApi#currencyGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CurrencyApi#currencyGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.collections.List&lt;Currency&gt;**](Currency.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


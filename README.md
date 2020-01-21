<h1 align="center">Welcome to spring-specification-rest-demo 👋</h1>
<p>
  <a href="https://twitter.com/MalcMacphail" target="_blank">
    <img alt="Twitter: MalcMacphail" src="https://img.shields.io/twitter/follow/MalcMacphail.svg?style=social" />
  </a>
</p>

> Spring Rest and Specifications feature demo

## Why ?

Spring Boot provides awesome feature for easily creating a Rest search API.

This [library](https://github.com/tkaczmarzyk/specification-arg-resolver) is great to use a very clean form of Spring Data Specification.

Be careful, some additional setup is needed in the `SpringSpecDemoApplication` class.

## Try it!

To demonstrate how to call this API, use the following curl command:

    curl "http://localhost:8080/book?page=0&title=reliques&author=Rowling" | jq

The response should be the following:
```
{
  "content": [
    {
      "id": 3,
      "title": "Harry Potter et les reliques de la mort",
      "author": "J.K. Rowling"
    }
  ],
  "pageable": {
    "sort": {
      "sorted": false,
      "unsorted": true,
      "empty": true
    },
    "pageNumber": 0,
    "pageSize": 20,
    "offset": 0,
    "unpaged": false,
    "paged": true
  },
  "last": true,
  "totalPages": 1,
  "totalElements": 1,
  "first": true,
  "sort": {
    "sorted": false,
    "unsorted": true,
    "empty": true
  },
  "size": 20,
  "number": 0,
  "numberOfElements": 1,
  "empty": false
}
```

## Author

👤 **Alexandre Fruchaud**

* Twitter: [@MalcMacphail](https://twitter.com/MalcMacphail)
* Github: [@mmacphail](https://github.com/mmacphail)

## Show your support

Give a ⭐️ if this project helped you!

***
_This README was generated with ❤️ by [readme-md-generator](https://github.com/kefranabg/readme-md-generator)_
# Caelum Books - Payfast
Simple Payment System to teach about RESTful applications at Caelum - SOA Course

### Retrieve Payment by id code

You can you **curl** command to retrieve some payment from its id code:

```bash
$ curl -i -X GET http://localhost:8080/caelum-books-payfast/payment/1 -H "Accept: application/xml"
```

You will see a result as below:

```xml
HTTP/1.1 200 OK
Connection: keep-alive
X-Powered-By: Undertow/1
Server: WildFly/8
Transfer-Encoding: chunked
Content-Type: application/json
Date: Sun, 01 Nov 2015 12:52:09 GMT

<payment>
  <id>1</id>
  <status>APROVED</status>
  <value>100</value>
</payment>
```

Take care with Accept header! If the endpoint can't retrieve json for example, you will receive a 406 HTTP status code.
To test, just change to application/json on Accept header:

```bash
$ curl -i -X GET http://localhost:8080/caelum-books-payfast/payment/1 -H "Accept: application/json"
```

And you will see a result as below:

```bash
HTTP/1.1 406 Not Acceptable
Connection: keep-alive
X-Powered-By: Undertow/1
Server: WildFly/8
Content-Length: 0
Date: Sun, 01 Nov 2015 12:06:04 GMT
```

You need to note that when you get data using xml Accept header, JAX-RS retrieves data using methods but when you use json Accept header, JAX-RS uses fields. 

Calling payment endpoint with **xml** Accept header will return this:

```xml
<payment>
  <id>1</id>
  <status>APROVED</status>
  <value>100</value>
</payment>
```

Calling payment endpoint with **json** Accept header will return this:

```json
{
    "id": 1,
    "value": 100,
    "status": "APROVED",
    "date": 1446379926296
}
```

Note that with json we can se **data** but with xml wen can't

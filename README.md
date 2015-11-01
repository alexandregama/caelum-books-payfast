# Caelum Books - Payfast
Simple Payment System to teach about RESTful applications at Caelum - SOA Course

### Retrieve Payment by id code

You can you **curl** command to retrieve some payment from its id code:

```bash
$ curl -i -X GET http://localhost:8080/caelum-books-payfast/payment/1 -H "Accept: application/xml"
```

You will see a result as below:

```xml
<payment>
  <id>1</id>
  <status>APROVED</status>
  <value>100</value>
</payment>
```

Take care with Accept content! If the endpoint can't retrieve json for example, you will receive a 406 HTTP status code.
To test, just change to application/json on Accept command:

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

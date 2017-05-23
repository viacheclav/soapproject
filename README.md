# soapproject
To call xml-rpc
Url: http://localhost:8080/xmlrpc
Method: POST
Header: Content-Type:application/xml
Body:
<?xml version="1.0"?>
<methodCall>
   <methodName>Calculator.add</methodName>
      <params>
         <param>
            <value><int>2</int></value>
         </param>
				         <param>
            <value><int>10</int></value>
         </param>
      </params>
</methodCall>

to call soap

Url: http://localhost:8080/test
Method: POST
Headers: 
Content-Type : text/xml;charset=UTF-8
SOAPAction : getProducts

Body:
<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:com="com.mywebservice">
   <soapenv:Body>
      <com:getProducts/>
   </soapenv:Body>
</soapenv:Envelope>

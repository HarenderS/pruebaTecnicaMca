# Prueba tecnica MCA
## Ejecución de la aplicación con docker
Para lanzar la aplicación debemos ejecutar el siguiente commando:
`docker run -p 8080:8080 harenderdhanoya/pruebatecnicamca`.

Con eso basta para lanzar la aplicación en local y dicha aplicación esta disponible en el puerto 8080.

## Uso de la aplicación
Para probar el funcionamiendo de la aplicación podemos ejecutar el siguiente comando: 
~~~ 
curl --location 'http://localhost:8080/prices/get' \
--header 'Content-Type: application/json' \
--data '{
    "BRAND_ID": 1,
    "PRODUCT_ID": 35455,
    "date": "2020-06-15-10.00.00"
}' 
~~~

O podemos usar postman para hacer una petición POST para el endpoint `http://localhost:8080/prices/get` pasando el body: 
~~~ 
{
    "BRAND_ID": 1,
    "PRODUCT_ID": 35455,
    "date": "2020-06-15-10.00.00"
} 
~~~

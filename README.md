### Grails 5 coverage

I followed the instructions in this guide

https://guides.grails.org/grails-code-coverage/guide/index.html


#### Versions

* Grails 5.1.8
* Groovy 3.0.11
* JDK 11


#### Comand to test coverage

```
./gradlew   clean  cloverGenerateReport
```

#### Problem in code

```
Integer result // => not working
Integer result = null // => working
```




 


To reproduce:

```
$ git clone https://github.com/test-url
$ cd test-url
$ ./gradlew test 

BUILD SUCCESSFUL in 304ms
1 actionable task: 1 executed

# Same thing but calling hashCode() on the URL
$ CALL_HASHCODE=1 ./gradlew test 

BUILD SUCCESSFUL in 304ms
1 actionable task: 1 executed
```

The task should be up-to-date no matter if we call hashCode() or not. Expected output:

```
$ ./gradlew test 

BUILD SUCCESSFUL in 304ms
1 actionable task: 1 executed

# Same thing but calling hashCode() on the URL
$ CALL_HASHCODE=1 ./gradlew test 

BUILD SUCCESSFUL in 304ms
1 actionable task: 1 up-to-date
```
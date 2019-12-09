# Date

## ساختن یک تاریخ با یک interval

مثلا ما یه تاریخ لازم داریم که چند روز بعد یا قبل از یه الان هست

```java
Date.from(
    LocalDate.now()
        .minusDays(10).atStartOfDay()
        .atZone(ZoneId.systemDefault())
    .toInstant()
    );
```
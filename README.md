# clever_backend_task2_addition

## Задача

Реализован gradle плагин плагин по формированию отчёта (jaCoCo). Создан мульти-модульный проект с двумя модулями: core,
арі. В модуле core расположен class Utils с методом boolean is AllPositiveNumbers(String... str). Использован
utils-1.3.5.jar сделанный на предыдущих этапах, для возможности переиспользовать метод boolean isPositiveNumber(String
str) в модуле core. В модуле арі находится class App с методом main. Из модуля арі в методе main вызывается Utils.is
AllPositive Numbers("12", "79"). Реализован один unit test для проверки этого метода boolean isAllPositiveNumbers(
String... str).
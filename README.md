# TestingProject
Шаги по созданию проекта:
1)Скачиваем Intellij Idea Community
2)Создаём новый проект, выбираем сборщик Maven
3)В файле pom.xml добавляем необходимые нам библиотеки JUnit и Selenium
4)В папке tests/java создаем пакет, а в нём - класс с первым тестом
5)Инициализируем ChromeDriver прямо внутри теста
6)Пишем тест, который открывает браузер, заходит на веб-страницу и проверяет, что страница открылась корректно + проверка заголовка
7)Убираем повторяющийся код, используя аннотации Before и After
Before- выполняет действия перед запуском теста  
After- выполняет действия каждый раз, когда тест завершен
8)Дублируем код теста, создаем второй тест
9)Аннотация Before
10)Выносим переменную driver выше по дереву. удаляем дублирование кода
11)Аннотация After и добавление туда кода после прохождения теста
12)Проверим работу кода строчкой: System.out.println("test");
Упростим работу тестов
13)Создадим отдельный класс для методов Before/After
14)Унаследуем этот класс в классе родителя (FirstTest)
username=postgres
password=postgres
Имя базы данных: "bookstore"
Скрипты на создание БД лежат в resources/SQLscripts
P.S. Postgres часто ругается и не дает создавать все таблицы и заполнить их данными с помощью 1 скрипта, поэтому
рекомендую выполнить отдельно создание таблиц и наполнение их данными.

context-path=/bookstore

Ссылка на Swagger для проверки запросов http://localhost:8080/bookstore/swagger-ui.html

Для каждой сущности были реализованы CRUD операции. Псмотреть их реализацию можно в "repository/'Entity_name'Repository"

Для реализации запросов 3-5 пунктов задания был создан отдельный QueryRepository, QueryService и QueryController.
В QueryRepository нахоядятся все реализации запросов вместе с комментариями, какому заданию какой запрос соотвествует.

P.S.При работе с полем Data использовать формат "YYYY-MM-DD"

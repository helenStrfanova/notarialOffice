# notarialOffice

7. Нотаріальна контора

Опис предметної області

Ви працюєте в нотаріальній конторі. Вашим завданням є відстеження фінансової сторони роботи компанії.
Діяльність нотаріальної контори організована таким чином: фірма готова надати клієнтові певний комплекс послуг. Для наведення порядку ви формалізували ці послуги, склавши їхній список з описом кожної послуги. При звертанні до вас клієнта його стандартні дані (назва, вид діяльності, адреса, телефон) фіксуються в базі даних. За кожним фактом надання послуги клієнтові складається документ. У документі вказуються послуга, сума угоди, комісійні (дохід контори), опис угоди.
Можливий набір сутностей:

Клієнти (Код клієнта, Назва, Вид діяльності, Адреса, Телефон).
Угоди (Код угоди, Код клієнта, Код послуги, Сума, Комісійні, Опис).
Послуги (Код послуги, Назва, Опис).

Розширення постановки завдання

Тепер ситуація змінилася. У рамках однієї угоди клієнтові може бути зроблено кілька послуг. Вартість кожної послуги фіксована. Крім того, компанія надає в рамках однієї угоди різні види знижок. Знижки можуть підсумовуватися.
Внести в структуру таблиць зміни, що враховують ці факти, і змінити існуючі запити.
Додати нові запити.

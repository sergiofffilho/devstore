# crud-basico-spring2
CRUD Básico usando Spring Framework

```sql
insert into usuario (habilitado, login, password) values (true, 'admin', '97e7ae26dd76600646701e97840d52b6ab7cb23cd03f8fa8e50640d84b52b5e1');

insert into papel (nome) values ('ROLE_CONTATO');
insert into papel_usuario (usuario_id, papel_id) values ((select id from usuario where login='admin' limit 1),(select id from papel where nome='ROLE_CONTATO' limit 1));

select * from usuario;
select * from papel;
select * from papel_usuario;
```

Senha do usuário admin: teste1234

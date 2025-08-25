INSERT INTO raca (nome, especie)
VALUES ('SRD', 'CACHORRO');

INSERT INTO raca (nome, especie)
VALUES ('Rottweiler', 'CACHORRO');

INSERT INTO raca (nome, especie)
VALUES ('Pinsher', 'CACHORRO');

INSERT INTO raca (nome, especie)
VALUES ('Siamese', 'GATO');

INSERT INTO raca (nome, especie)
VALUES ('Persian', 'GATO');

INSERT INTO funcionario (nome)
VALUES ('Cleber');
INSERT INTO funcionario (nome)
VALUES ('Renato');
INSERT INTO funcionario (nome)
VALUES ('Giovanna');
INSERT INTO funcionario (nome)
VALUES ('Wellington');

INSERT
INTO
    animal
    (nome_provisorio, raca_id, idade_estimada, data_entrada, condicoes_chegada, funcionario_id, porte)
VALUES
    ('Cachorro da EBAC', 1, 5, current_date, 'Bem pulguento', 1,'Pequeno');

INSERT
INTO
    animal
    (nome_provisorio, raca_id, idade_estimada, data_entrada, condicoes_chegada, funcionario_id, porte)
VALUES
    ('Outro Cachorro da EBAC', 2, 10, current_date, 'Bem velhinho', 2,'Grande');

INSERT
INTO
    animal
    (nome_provisorio, raca_id, idade_estimada, data_entrada, condicoes_chegada, funcionario_id, porte, data_adocao)
VALUES
    ('Totó', 3, 2, current_date, 'chei de ódio', 3,'Pequeno', current_date);

INSERT
INTO
    animal
    (nome_provisorio, raca_id, idade_estimada, data_entrada, condicoes_chegada, funcionario_id, porte, data_adocao)
VALUES
    ('Perry', 4, 1, current_date, 'Preguiçoso', 4,'Pequeno', current_date);

INSERT
INTO
    animal
    (nome_provisorio, raca_id, idade_estimada, data_entrada, condicoes_chegada, funcionario_id, porte)
VALUES
    ('Malu', 5, 2, current_date, 'Cansado', 4,'Pequeno');
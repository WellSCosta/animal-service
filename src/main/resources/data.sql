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

INSERT
INTO
    animal
    (nome_provisorio, raca_id, idade_estimada, data_entrada, condicoes_chegada, nome_recebedor, porte)
VALUES
    ('Cachorro da EBAC', 1, 5, current_date, 'Bem pulguento', 'Cleber','Pequeno');

INSERT
INTO
    animal
    (nome_provisorio, raca_id, idade_estimada, data_entrada, condicoes_chegada, nome_recebedor, porte)
VALUES
    ('Outro Cachorro da EBAC', 2, 10, current_date, 'Bem velhinho', 'Renato','Grande');

INSERT
INTO
    animal
    (nome_provisorio, raca_id, idade_estimada, data_entrada, condicoes_chegada, nome_recebedor, porte, data_adocao)
VALUES
    ('Totó', 3, 2, current_date, 'chei de ódio', 'Giovanna','Pequeno', current_date);

INSERT
INTO
    animal
    (nome_provisorio, raca_id, idade_estimada, data_entrada, condicoes_chegada, nome_recebedor, porte, data_adocao)
VALUES
    ('Perry', 4, 1, current_date, 'Preguiçoso', 'Wellington','Pequeno', current_date);

INSERT
INTO
    animal
    (nome_provisorio, raca_id, idade_estimada, data_entrada, condicoes_chegada, nome_recebedor, porte)
VALUES
    ('Malu', 5, 2, current_date, 'Cansado', 'Wellington','Pequeno');
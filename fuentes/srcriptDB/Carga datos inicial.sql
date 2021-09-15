insert into tipo values
('aeorosol', 1),
('colirio',1),
('crema',1),
('capsula',0);

truncate table tipo;

insert into medicamento values
(12345,'PFG-12345-8','amoxol','amoxicilina','capsula',1), -- CODIGO VERIFICADOR ERRONEO PARA PRUEBAS
(54321,'RSH-54321-6','atomo','hidroquinona','crema',1),
(23412,'WRB-23412-3','colirio','ciclopentatolato','colirio',1);

truncate table medicamento;


CREATE TABLE motorista (
	codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	nome VARCHAR(50) NOT NULL,
	logradouro VARCHAR(30),
	numero VARCHAR(30),
	complemento VARCHAR(30),
	bairro VARCHAR(30),
	cep VARCHAR(30),
	cidade VARCHAR(30),
	estado VARCHAR(30),
	cnh VARCHAR(30),
	ativo BOOLEAN NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO motorista (nome, logradouro, numero, complemento, bairro, cep, cidade, estado,cnh, ativo) values ('Valerio França', 'Rua do Abacaxi', '10', null, 'Brasil', '38.400-12', 'Uberlândia', 'MG',123456789, true);
INSERT INTO motorista (nome, logradouro, numero, complemento, bairro, cep, cidade, estado,cnh, ativo) values ('Leonardo Cardoso', 'Rua do Sabiá', '110', 'Apto 101', 'Colina', '11.400-12', 'Ribeirão Preto', 'SP',987654321, true);
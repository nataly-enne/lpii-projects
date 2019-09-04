# Hospedagem
Projeto que simula o sistema de um Hotel (hospedagem, reserva, quantidade de hospedes, etc.)

# How?

A classe Hospedagem tinha apenas um hóspede. Agora é permitido que uma Hospedagem tenha 1 ou mais hóspedes. 
- Para isso, utilizamos na classe hospedagem uma coleção de hóspedes, um atributo para informar quem é o hóspede responsável pela reserva e um atributo para informar quantos hóspedes terá a reserva. 
- Também validamos a quantidade de hóspedes, alterarando a classe Aposento, de forma que ela saiba até quantos hóspedes pode receber. 
- A hospedagem nunca poderá exceder a quantidade de hóspedes que um aposento pode receber. Além disso, a coleção de hóspedes (da classe Hospedagem) não permite hóspedes duplicados.



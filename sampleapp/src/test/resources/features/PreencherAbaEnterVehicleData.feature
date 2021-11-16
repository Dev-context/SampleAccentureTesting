#language:pt
Funcionalidade: Acessar a pagina da Tricentis e cadastrar dados com sucesso

  Cenario: inseri dados em todas as abas e visualizar mensagem de sucesso
    Dado que estou acensando a aplicacao
    Quando clico em Automobilie
    E seleciono na opcao Make:"Audi"
    E preencho o campo Engine Performance [kW]:"2000"
    E informo a Date of Manufacture:"03/12/1994"
    E seleciono na opcao Number of Seats: 4
    E seleciono na opcao Fuel Type:"Petrol"
    E informo a List Price [$]:1000
    E infomo a License Plate Number:"XPTO 707"
    E informo a Annual Mileage [mi]: 1500
    E clico no botao Next
    
    E vou para aba Enter Insurant Data
    E preencho First Name: "Ana"
    E preencho Last Name: "Silva"
    E preencho Date of Birth: "07/15/1994"
    E seleciono genero: "Female"
    E preencho Street Adress: "Rua teste"
    E seleciono Country: "Canada"
    E preencho Zip Code: "752415"
    E preencho City: "Vancouver"
    E seleciono o Occupation: "Farmer"
    E informo os Hobbies
    E preencho o Website:"teste.com.br"
    E insiro a Picture
    E clico em Next
    
    E vou para aba Enter Product Data
    E insiro a Start Date:"01/11/2022"
    E seleciono Insurance Sum [$]:"3.000.000,00"
    E seleciono Merit Rating:"Bonus 4"
    E seleciono Damage Insurance: "Full Coverage"
    E marco a opcao Optional Products
    E seleciono Courtesy Car:"No"
    E clico no botao Next ir para price Option
    
    E vou para aba Select Price Option  
    E marcar a opcao: "Silver"
    E clico em Next para ir para Send quote
    
    
    
    E vou para proxima aba Send Quote
    E insiro o E-mail: "teste@gmail.com"
    E insiro o Phone:"55227999999"
    E insiro o Username:"Telnet2020"
    E insiro o Password:"@t@123T"
    E insiro o Confirm Password:"@t@123T"
    E insiro o comments:"Esse e um teste automatizado"
    E clico em Send
    Entao o sistema exibe uma mensagem de sucesso: "Send e-mail success!"

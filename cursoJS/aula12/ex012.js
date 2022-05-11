var agora = new Date()
var hora = agora.getHours()
console.log(`Agora são exatamente ${hora} horas.`)
if (hora >= 00 && hora < 5) {
    console.log('Boa Madrugada!')
} else if (hora >= 5 && hora < 13) {
    console.log('Bom Dia!')
} else if (hora >= 13 && hora < 19) {
    console.log('Boa Tarde!')
} else {
    console.log('Boa Noite!')
}
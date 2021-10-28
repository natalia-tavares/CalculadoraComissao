fun main(args: Array<String>) {
    var valorVenda:Float
    var comissao:Float
    println("Informe o valor das vendas: ")
    valorVenda= readLine()!!.toFloat()
    comissao=(valorVenda/100)
    if(valorVenda>=10000){
        comissao=comissao*30
        println("O valor de comissao é igual a  $comissao")
    }else if(valorVenda>=5001 && valorVenda<=9999){
        comissao=comissao*20
        println("O valor de comissao é igual a  $comissao")
    }else if(valorVenda>=1001 && valorVenda<=4999){
        comissao=comissao*10
        println("O valor de comissao é igual a  $comissao")
    }else if (valorVenda<=1000){
        println("Nao é aplicado valor de comissao 5")
    }

}
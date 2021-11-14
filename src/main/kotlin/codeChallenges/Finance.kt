package codeChallenges

import java.math.RoundingMode
import java.text.DecimalFormat

object Finance { // https://www.codewars.com/kata/59c68ea2aeb2843e18000109/train/kotlin
    private data class MonthlyDetail(val payment_C: Float, val princ: Float, val balance: Float)
    private var howMany: Int = 0

    fun amort(rate: Double, bal: Int, term: Int, num_payments: Int): String {

        println("The rate: $rate")
        println("The bal: $bal")
        println("The term: $term")
        println("The num_payments: $num_payments")
        howMany = term

        monthlyPaymentHelp(0, bal, rate, MonthlyDetail(0f, 0f, 0f))

        return "num_payment $num_payments c $.0f princ $.0f int $.0f balance $.0f"
    }

    private fun monthlyPaymentHelp(month: Int, bal: Int, rate: Double, statement: MonthlyDetail): MonthlyDetail {
        if (month != howMany) {
            val newMonth = month + 1
            val interest = bal*(rate/100)
            val df = DecimalFormat("#.##")
            df.roundingMode = RoundingMode.HALF_DOWN // https://www.programiz.com/kotlin-programming/examples/round-number-decimal
            println("rounded Interest Float: " + df.format(interest))
            println("the new interest: $interest")
        }

        return MonthlyDetail(0.0f,0.0f,0.0f)
    }
}
package app.itakura.reirei.a03jyankenapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gooButton.setOnClickListener {
            you.text = "あなたの手はグーです"
            val number:Int = Random.nextInt(3)

            when(number){
                0->{
                    imageView.setImageResource(R.drawable.goo)
                    result.text = "引き分けです"
                }
                1->{
                    imageView.setImageResource(R.drawable.choki)
                    result.text = "あなたの勝ちです"
                    result.setTextColor(Color.RED)
                }
                2->{
                    imageView.setImageResource(R.drawable.paa)
                    result.text = "あなたの負けです"
                }
            }
        }

        chokiButton.setOnClickListener {
            you.text = "あなたの手はチョキです"
            val number:Int = Random.nextInt(3)

            when(number){
                0->{
                    imageView.setImageResource(R.drawable.goo)
                    result.text = "あなたの負けです"
                }
                1->{
                    imageView.setImageResource(R.drawable.choki)
                    result.text = "引き分けです"

                }
                2->{
                    imageView.setImageResource(R.drawable.paa)
                    result.text = "あなたの勝ちです"
                    result.setTextColor(Color.RED)
                }
            }
        }

        paaButton.setOnClickListener {
            you.text = "あなたの手はパーです"
            val number:Int = Random.nextInt(3)

            when(number){
                0->{
                    imageView.setImageResource(R.drawable.goo)
                    result.text = "あなたの勝ちです"
                    result.setTextColor(Color.RED)


                }
                1->{
                    imageView.setImageResource(R.drawable.choki)
                    result.text = "あなたの負けです"

                }
                2->{
                    imageView.setImageResource(R.drawable.paa)
                    result.text = "引き分けです"

                }
            }
        }
    }
}
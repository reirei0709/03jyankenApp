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
            player.text = "あなたの手はグーです"
            val number:Int = Random.nextInt(3)

            when(number){
                0->{
                    cpu.text = "相手の手はグーです"
                    result.text = "引き分けです"
                }
                1->{
                    cpu.text = "相手の手はチョキです"
                    result.text = "あなたの勝ちです"
                    result.setTextColor(Color.RED)
                }
                2->{
                    cpu.text = "相手の手はパーです"
                    result.text = "あなたの負けです"
                }
            }
        }

        chokiButton.setOnClickListener {
            player.text = "あなたの手はチョキです"
            val number:Int = Random.nextInt(3)

            when(number){
                0->{
                    cpu.text = "相手の手はグーです"
                    result.text = "あなたの負けです"
                }
                1->{
                    cpu.text = "相手の手はチョキです"
                    result.text = "引き分けです"

                }
                2->{
                    cpu.text = "相手の手はパーです"
                    result.text = "あなたの勝ちです"
                    result.setTextColor(Color.RED)
                }
            }
        }

        paaButton.setOnClickListener {
            player.text = "あなたの手はパーです"
            val number:Int = Random.nextInt(3)

            when(number){
                0->{
                    cpu.text = "相手の手はグーです"
                    result.text = "あなたの勝ちです"
                    result.setTextColor(Color.RED)
                    result.text = "あなたの負けです"
                }
                1->{
                    cpu.text = "相手の手はチョキです"
                    result.text = "あなたの負けです"

                }
                2->{
                    cpu.text = "相手の手はパーです"
                    result.text = "引き分けです"

                }
            }
        }
    }
}
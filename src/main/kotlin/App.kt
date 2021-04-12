import com.github.kotlintelegrambot.bot
import com.github.kotlintelegrambot.dispatch
import com.github.kotlintelegrambot.dispatcher.message
import org.slf4j.LoggerFactory.getLogger

fun main(args: Array<String>) {
  val log = getLogger("bot")
  bot {
    token = System.getenv("TOKEN")
    dispatch {
      message {
        log.info(message.text)
      }
    }
  }.startPolling()
}


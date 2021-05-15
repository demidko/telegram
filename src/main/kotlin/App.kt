import com.github.kotlintelegrambot.bot
import com.github.kotlintelegrambot.dispatch
import com.github.kotlintelegrambot.dispatcher.message
import org.slf4j.LoggerFactory.getLogger
import java.lang.System.getenv

fun main(args: Array<String>) = bot {
  val log = getLogger("Bot")
  token = getenv("TOKEN")
  dispatch {
    message {
      log.info(message.text)
    }
  }
}.startPolling()



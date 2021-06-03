import com.github.kotlintelegrambot.bot
import com.github.kotlintelegrambot.dispatch
import com.github.kotlintelegrambot.dispatcher.message
import com.github.kotlintelegrambot.entities.ChatId.Companion.fromId
import java.lang.System.getenv

fun main(args: Array<String>) = bot {
  token = getenv("TOKEN")
  dispatch {
    message {
      val chatId = fromId(message.chat.id)
      bot.sendMessage(chatId, "Hello, telegram user!")
    }
  }
}.startPolling()



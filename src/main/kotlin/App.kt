import com.github.kotlintelegrambot.bot
import com.github.kotlintelegrambot.dispatch
import com.github.kotlintelegrambot.dispatcher.message
import com.github.kotlintelegrambot.entities.ChatId.Companion.fromId

fun main(args: Array<String>) = bot {
  token = "TODO: your token here"
  dispatch {
    message {
      val chatId = fromId(message.chat.id)
      bot.sendMessage(chatId, "Hello, telegram user!")
    }
  }
}.startPolling()



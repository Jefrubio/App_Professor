package fernandosousa.com.br.lmsapp

import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.support.v4.app.NotificationCompat

object NotificationUtil {

    internal val CHANNEL_ID = "1"

    fun create(contexto: Context, id: Int, intent: Intent, titulo: String, texto: String) {
        val manager = contexto.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

        // Intent para disparar broadcast
        val p = PendingIntent.getActivity(contexto, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT)

        // Cria notificação
        val builder = NotificationCompat.Builder(contexto, CHANNEL_ID)
                .setContentIntent(p)
                .setContentTitle(titulo)
                .setContentText(texto)
                .setSmallIcon(R.mipmap.ic_launcher)
                .setAutoCancel(false)

        // disparar notificacao
        val n = builder.build()
        manager.notify(id, n)
    }
}
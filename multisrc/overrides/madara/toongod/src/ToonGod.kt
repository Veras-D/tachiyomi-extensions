package eu.kanade.tachiyomi.extension.en.toongod

import eu.kanade.tachiyomi.annotations.Nsfw
import eu.kanade.tachiyomi.multisrc.madara.Madara
import java.text.SimpleDateFormat
import java.util.Locale

@Nsfw
class ToonGod : Madara("ToonGod", "https://www.toongod.com", "en", SimpleDateFormat("dd MMM yyyy", Locale.US))

# Changelog

Piume shows the section for its own version in **Piume settings → Updates** after an update.
The build stops if `versionName` has no section here.

Write every entry in ASD-STE100 Simplified Technical English:

- Write one idea in each sentence. Use 20 words or fewer in each sentence.
- Use the active voice and the present tense.
- Write instructions as commands: "Select **Updates**", not "**Updates** can be selected".
- Use one word for one thing. Use the names that Piume shows on the screen.
- Start each entry with "- ". Piume shows each entry as one item. It removes `**` marks.

Put changes that are not released under `## Unreleased`. Rename that heading to the version number when you release.

## Unreleased

## 4.2.1

- Piume is now **Zephyr TV**. This is the last version of Piume. Piume shows a page to install Zephyr TV.
- When Zephyr TV starts for the first time, it takes from Piume your settings, your users, what you watched, your progress and your Trakt accounts. Then you can uninstall Piume.
- When you select a film or series, its page opens at once and shows **Loading** until the information is there.
- The page of a series tells you that you can hold OK on an episode to mark it.
- Search has **Clear the filters**. The results of a search with words also show the filters.
- In the list of years, Left and Right go back and forward 10 years.
- With Trakt, the first sync sends to Trakt what you watched in Piume before. After that, what you remove on Trakt is removed in Piume too. A title that you finish elsewhere leaves Continue Playing.
- An episode that you watch to the end in Piume counts as watched on Trakt too, also when it is short.
- Long downloads (TV guide, channel logos, updates, Trakt) do not slow down the pages and the search any more.

- To open **Settings** in the users panel, you must type the PIN when the layout lock is on. Changing the user in use does not need it.
- Piume does not disconnect Trakt by itself any more when the home screen and the player renew the access at the same time.
- When Trakt refuses the account, Piume tells you to connect it again. When Trakt refuses a sign-in, the TV tells you at once.
- On the page of a film, series or episode, the focus stays on its row when the page gets new information.
- What you watch is not lost any more when the player and the home screen save it at the same time.
- A series gets ✓ when you watched all its episodes. Specials do not count.

## 4.2.0

- Films and series from Stremio add-ons. **Cinemeta**, the free library of Stremio, fills the new **Films** and **Series** tiles with rows. To give each add-on its own tile, select **Piume settings → Stremio add-ons → Films and series**.
- Cinemeta is always on. To use another Cinemeta address, select **Piume settings → Stremio add-ons → Cinemeta library**.
- With a TMDB key, the names, posters, genres and descriptions of films and series, and the names of episodes, are in your language.
- The cards show the year, the genre and the rating, with the icon of their tile. A ✓ shows the titles that you watched.
- Select a film to see its page, with **Watch**, the rating, the trailer and the services that have it. When one add-on alone has the streams, the page says **Watch on** and its name.
- On the page of a series, Left and Right change the season. Select an episode to see its page and its streams. When more than one add-on has streams, the page has **Watch on** for each add-on.
- Piume plays films and episodes in its own player. It tries the streams of all the add-ons, and the next one if a stream does not work. Only direct links play, not torrents.
- In the player, Left and Right go back and forward 10 seconds. CH+ and CH- go to the previous and next episode. When an episode ends, the next one starts.
- The player shows the season, the number and the name of the episode. The names of streams show on two lines. The sound goes to the audio output of the TV, also to external speakers.
- When you go back from the player, the page that you came from shows again.
- Films and episodes that you begin show in **Continue Playing**. When an episode ends, the next episode shows there with **Up next**.
- Piume remembers the films and episodes that you watch to the end. A watched film has **Watch again**. To change a mark, select **Mark as watched** or **Mark as not watched**. On a series, hold OK on an episode, or select **Mark season as watched**.
- The **Films** tile has a **Films watched** row at the bottom, and the **Series** tile has a **Series watched** row. The most recent is first.
- The page of a film or episode shows when you watched it. The page of a series shows the last episode that you watched.
- Piume has users. Select the users icon, left of search, and select a name to use that user. The icon shows the first two letters of the name. Each user has their own Continue Playing and ✓ marks.
- To add, rename or remove a user, or to connect Trakt, select **Settings** under the names.
- Each user can connect a Trakt account. Select **Connect Trakt** and scan the code with your phone. What you watch in Piume goes to Trakt. What you watched elsewhere gets ✓, and where you paused shows in Continue Playing.
- Search finds films and series in Cinemeta and in the add-ons. With a TMDB key, it also finds them by their names in your language. A result opens the same page as in the Films and Series tiles.
- Search has filters: **Films or series**, **Year** and **Genre**. Select **Search** with no words to find the titles for the filters.
- Spotlight works without a TMDB key: it shows the popular films and series of Cinemeta. With a TMDB key, you can still select a TMDB list in **Piume settings → Spotlight → Source**. Spotlight has a **Watch** button.
- To give a section your own name, hold OK on an app and select **Rename sections**.

## 4.1.0-beta.6

- This version is a beta. To get betas as updates, turn on **Piume settings → Updates → Receive betas**.
- Piume has users. Select the users icon, left of search, to add a user or to change the user in use. Each user has their own Continue Playing and ✓ marks.
- Each user can connect their Trakt account. Select the user, then **Connect Trakt**, and scan the code with your phone.
- With Trakt, what you watch in Piume goes to your Trakt history. What you watched elsewhere gets ✓, and where you paused shows in Continue Playing.

## 4.1.0-beta.5

- This version is a beta. To get betas as updates, turn on **Piume settings → Updates → Receive betas**.
- Piume remembers the films and episodes that you watch to the end. Their cards and pages show ✓.
- The page of a film that you watched has **Watch again**. To change the mark, select **Mark as watched** or **Mark as not watched**.
- On the page of a series, hold OK on an episode to mark it as watched or not watched. To mark all the episodes of the season, select **Mark season as watched**.
- When an episode ends, the next episode stays in **Continue Playing** with **Up next**. Continue Playing shows one card for each series.
- The page of a series opens on the season and the episode to watch next.
- Cinemeta is the source of all films and series: the Films and Series tiles, the search and Spotlight. TMDB only translates them and adds the trailer and the services.
- Search finds films and series in Cinemeta and in the add-ons. With a TMDB key, it also finds them by their names in your language.
- Select a search result to see the same page as in the Films and Series tiles, with its seasons, episodes and streams.
- Spotlight has a **Watch** button when an add-on has streams for films or series. It opens the page of the title.

## 4.1.0-beta.4

- This version is a beta. To get betas as updates, turn on **Piume settings → Updates → Receive betas**.
- On the page of a series, Left and Right go to the previous and next season.
- Select an episode to see its page: its picture, season, number, name, date and description. Piume then asks the add-ons for its streams.
- When more than one add-on has streams for the episode, the page has **Watch on** for each add-on, with the number of streams.
- The player shows the season, the number and the name of the episode.
- When you go back from the player, the page of the film, series or episode shows again, with its progress.
- Spotlight works without a TMDB key. It shows the popular films and series of Cinemeta. With a TMDB key, their names, descriptions and genres are in your language.
- With a TMDB key, you can still select one of the TMDB lists in **Piume settings → Spotlight → Source**.

## 4.1.0-beta.3

- This version is a beta. To get betas as updates, turn on **Piume settings → Updates → Receive betas**.
- The cards of films and series show the year, the genre and the rating, with the icon of their tile.
- The page of a film or series shows the rating. With a TMDB key, it also has the trailer and the services that have the title.
- The page of a film or series and the player show the same picture as the card.
- To give a section your own name, hold OK on an app and select **Rename sections**. To get the name back, select **Original name**.
- Cinemeta is always on. To use another Cinemeta address, select **Piume settings → Stremio add-ons → Cinemeta library**.
- On the page of a search result, **Watch on** plays a film immediately. For a series, it shows the episodes.
- In the player, the names of streams show on two lines.
- The player sends the sound to the audio output of the TV, also to external speakers. It pauses when headphones or a Bluetooth speaker disconnect.

## 4.1.0-beta.2

- This version is a beta. To get betas as updates, turn on **Piume settings → Updates → Receive betas**.
- When only one add-on has streams for a film or series, its page says **Watch on** and the add-on's name (or **Resume from 12:34 on** the add-on), with the add-on's icon. The same is true on the page of a TMDB result.
- Films and series from Stremio add-ons. **Cinemeta**, the catalog of Stremio, fills the new **Films** and **Series** tiles with rows. To give each add-on its own tile, select **Piume settings → Stremio add-ons → Films and series**. You can turn Cinemeta off in the same section.
- Select a film or a series to see its page. A film has **Watch**. A series has its seasons and episodes.
- Piume asks all the add-ons that have streams for the title. It plays the first stream that works, and tries the next one if it does not work. To choose another stream, use the **Stream** button in the player.
- Only direct links play (http addresses, also .php addresses). Torrents do not play.
- In the player, Left and Right go back and forward 10 seconds (more if you hold them). CH+ and CH- go to the previous and next episode. When an episode ends, the next one starts.
- The films and episodes that you begin show in **Continue Playing** with their progress. They start again where you stopped.
- Without a TMDB key, search finds films and series in the add-ons' catalogs. With a TMDB key, the page of a film or series has **Watch with the add-ons**.
- You can add an add-on that has only films and series, with no TV channels.
- Cinemeta is in English only. With a TMDB key, the names, posters, genres and descriptions of films and series, and the names and descriptions of episodes, come from TMDB in the language of Piume. What TMDB does not have in your language stays in English.

## 4.1.0-beta.1

- This version is a beta. To get betas as updates, turn on **Piume settings → Updates → Receive betas**.
- Films and series from Stremio add-ons. **Cinemeta**, the catalog of Stremio, fills the new **Films** and **Series** tiles with rows. To give each add-on its own tile, select **Piume settings → Stremio add-ons → Films and series**. You can turn Cinemeta off in the same section.
- Select a film or a series to see its page. A film has **Watch**. A series has its seasons and episodes.
- Piume asks all the add-ons that have streams for the title. It plays the first stream that works, and tries the next one if it does not work. To choose another stream, use the **Stream** button in the player.
- Only direct links play (http addresses, also .php addresses). Torrents do not play.
- In the player, Left and Right go back and forward 10 seconds (more if you hold them). CH+ and CH- go to the previous and next episode. When an episode ends, the next one starts.
- The films and episodes that you begin show in **Continue Playing** with their progress. They start again where you stopped.
- Without a TMDB key, search finds films and series in the add-ons' catalogs. With a TMDB key, the page of a film or series has **Watch with the add-ons**.
- You can add an add-on that has only films and series, with no TV channels.
- Cinemeta is in English only. With a TMDB key, the names, posters, genres and descriptions of films and series, and the names and descriptions of episodes, come from TMDB in the language of Piume. What TMDB does not have in your language stays in English.

## 4.0.2

- In the player, OK puts a frame on the program on now. Press OK again to see the full description. Press Down to go to the buttons, and Up to go back to the program.
- The player buttons are now icons. They are on the right, next to the stream line and the audio line.
- In search, the page of an add-on channel shows the app it plays from, with its icon. For example, **Watch on OMG+ TV - DDT**.
- In **Continue Playing**, the card of the add-on channel you watched last has a small icon, as the other cards do. It is the icon of the app it plays from: the add-on's app, the IPTV app or the TV app.

## 4.0.1

- The settings section **TV & IPTV** is now called **TV & EPG**.

## 4.0.0

- Piume can show the TV channels of Stremio add-ons, for example OMG+ TV. Piume settings have a new section, **Stremio add-ons**.
- Select **Add an add-on** and scan the QR code. Paste the address of the add-on's manifest on your phone. To type it with the remote, select **Type the address with the remote**.
- The channels of an add-on show as rows. The first row has all the channels. Then each category has a row of its own.
- Select **TV channels** to choose where the rows show: **In the TV app**, **In an IPTV app** or **An app per add-on**. Without a TV app, they show in the IPTV app. An app per add-on has the add-on's name and logo.
- Select an add-on and then **Move up** or **Move down** to change the order of its rows.
- The cards show the program on now with a progress bar, as the add-on gives it. Logos come from the add-on first, then from iptv-org.
- Select a channel to play it in the new Piume player. CH+ and CH- change the channel. You can also type the channel number, or press the Last channel key.
- When a channel loads, the player shows its logo and name. If a stream does not work, the player tries the next stream automatically.
- Press OK to show the banner with the program on now, the stream and its resolution. Press OK again to see the full description and what is next.
- When the banner shows, press Down, Left or Right to go to its buttons: **Pause**, **Audio**, **Subtitles** and **Stream**.
- When the banner does not show, Left and Right change the stream. Hold OK (or press Menu) to see the audio tracks and the subtitles. Piume remembers the languages you choose.
- The channel you watched last shows in **Continue Playing**. Select the tile of an add-on (or the IPTV app) to watch it again.
- Search finds the channels of the add-ons too. Search works also without a TMDB key.
- Hold OK on a channel of an add-on and select **Details** to see what the add-on tells about it.
- The row **Continue Watching** is now called **Continue Playing**, because it also shows music and other things that play.
- On the home screen, press Back on a card in a lower section to go back to the first section of the app.
- The lists of rows and sections in Piume settings have **Select all** and **Deselect all**.
- The backup includes the add-ons.
- Piume is larger: about 1.2 MB. The player needs the extra space.

## 4.0.0-beta.9

- This version is a beta. To get betas as updates, turn on **Piume settings → Updates → Receive betas**.
- In the player, press OK to show the banner. Then Up and Down go to the buttons **Pause**, **Audio**, **Subtitles** and **Stream**. They do not change the channel. When the banner is not shown, Up and Down change the channel as before.
- The player banner shows the resolution of the stream next to its name, for example **1080p** or **4K**.
- The player banner has a **Pause** button, first before **Audio**. Press it to pause the channel, and again (**Play**) to play it. While the channel is paused, the banner stays and shows **Paused**. A live channel that is paused for a long time goes back to the live broadcast when it plays again.
- When a channel loads, the player shows its logo and name in the middle of the screen. Below them it shows **Loading stream 1 of 3**, when the channel has more than one stream. If a stream does not work, the player tries the next one automatically. If no stream works, it shows **No stream available**.
- The player banner has the buttons **Audio**, **Subtitles** and **Stream**. While the banner shows, press Left or Right to go to them, then OK to open the list and choose. When the banner is not shown, Left and Right change the stream as before.
- Hold OK (or press Menu) to see the audio tracks and the subtitles together. The banner shows which ones play. Piume remembers the languages you choose for the next channels. The audio and subtitles keys of the remote also work.
- The player shows subtitles, also the picture subtitles that many IPTV streams have.
- In the player, the banner shows only the program on now and the stream. Press OK again to see the full description and what is next.
- In the player, Right no longer closes the player when the other stream does not work. The player tries the next stream, also the ones before it.
- In **Stremio add-ons**, select an add-on and then **Move up** or **Move down** to change the order. In the TV app and the IPTV app, the rows of the first add-on show first.
- The rows of a large IPTV add-on no longer stop the other apps. Before, while Piume loaded them, no app showed its rows.
- Piume keeps the rows of an add-on. When you go back to its tile, they show at once. Before, Piume loaded them again each time.
- Rows far down get their cards when you come near them. With many categories, the home screen stays smooth.
- Piume reads each add-on with fewer requests and keeps less on the TV.
- Logos and what is on come from the add-on first. Piume uses the logos from iptv-org and your TV guide only when the add-on has none, or when its logo does not load.
- In the player, CH+ and CH- (or Up and Down) go to the next and previous channel of the row. You can also type the channel number, or press the Last channel key.
- In the player, Left and Right change to another stream of the same channel. A stream that stops or does not start goes to the next stream automatically.
- In the player, OK or Info shows the channel's logo, its number in the row, the time, the program on now with a progress bar, what is next and the stream.
- The channel you watched last shows in **Continue Playing**. Select the tile of an add-on (or the IPTV app) to watch it again.
- Search finds the channels of the add-ons too, in the same row as the TV channels. It works also without a TMDB key.
- Hold OK on a channel of an add-on and select **Details** to see what the add-on tells about it.
- The row **Continue Watching** is now called **Continue Playing**, because it also shows music and other things that play.
- Piume settings have a new section, **Stremio add-ons**. Select **Add an add-on** and type the address of the add-on's manifest. You can also paste it on your phone.
- The TV channels of an add-on show as rows. The first row has all the channels. Then each category has a row of its own.
- Select **TV channels** to choose where the rows show: **In the TV app**, **In an IPTV app** or **An app per add-on**. Without a TV app, they show in the IPTV app.
- An app per add-on has the add-on's name and logo, from its manifest.
- Select a channel to play it in the Piume player. If a stream does not play, the player tries the next stream.
- The cards show the program on now, if the add-on gives it.
- Piume reads the channels of each add-on again every 15 minutes.
- The backup includes the add-ons.
- Piume is larger: about 1.2 MB. The player needs the extra space.

## 4.0.0-beta.8

- This version is a beta. To get betas as updates, turn on **Piume settings → Updates → Receive betas**.
- The player banner has a **Pause** button, first before **Audio**. Press it to pause the channel, and again (**Play**) to play it. While the channel is paused, the banner stays and shows **Paused**. A live channel that is paused for a long time goes back to the live broadcast when it plays again.
- When a channel loads, the player shows its logo and name in the middle of the screen. Below them it shows **Loading stream 1 of 3**, when the channel has more than one stream. If a stream does not work, the player tries the next one automatically. If no stream works, it shows **No stream available**.
- The player banner has the buttons **Audio**, **Subtitles** and **Stream**. While the banner shows, press Left or Right to go to them, then OK to open the list and choose. When the banner is not shown, Left and Right change the stream as before.
- Hold OK (or press Menu) to see the audio tracks and the subtitles together. The banner shows which ones play. Piume remembers the languages you choose for the next channels. The audio and subtitles keys of the remote also work.
- The player shows subtitles, also the picture subtitles that many IPTV streams have.
- In the player, the banner shows only the program on now and the stream. Press OK again to see the full description and what is next.
- In the player, Right no longer closes the player when the other stream does not work. The player tries the next stream, also the ones before it.
- In **Stremio add-ons**, select an add-on and then **Move up** or **Move down** to change the order. In the TV app and the IPTV app, the rows of the first add-on show first.
- The rows of a large IPTV add-on no longer stop the other apps. Before, while Piume loaded them, no app showed its rows.
- Piume keeps the rows of an add-on. When you go back to its tile, they show at once. Before, Piume loaded them again each time.
- Rows far down get their cards when you come near them. With many categories, the home screen stays smooth.
- Piume reads each add-on with fewer requests and keeps less on the TV.
- Logos and what is on come from the add-on first. Piume uses the logos from iptv-org and your TV guide only when the add-on has none, or when its logo does not load.
- In the player, CH+ and CH- (or Up and Down) go to the next and previous channel of the row. You can also type the channel number, or press the Last channel key.
- In the player, Left and Right change to another stream of the same channel. A stream that stops or does not start goes to the next stream automatically.
- In the player, OK or Info shows the channel's logo, its number in the row, the time, the program on now with a progress bar, what is next and the stream.
- The channel you watched last shows in **Continue Playing**. Select the tile of an add-on (or the IPTV app) to watch it again.
- Search finds the channels of the add-ons too, in the same row as the TV channels. It works also without a TMDB key.
- Hold OK on a channel of an add-on and select **Details** to see what the add-on tells about it.
- The row **Continue Watching** is now called **Continue Playing**, because it also shows music and other things that play.
- Piume settings have a new section, **Stremio add-ons**. Select **Add an add-on** and type the address of the add-on's manifest. You can also paste it on your phone.
- The TV channels of an add-on show as rows. The first row has all the channels. Then each category has a row of its own.
- Select **TV channels** to choose where the rows show: **In the TV app**, **In an IPTV app** or **An app per add-on**. Without a TV app, they show in the IPTV app.
- An app per add-on has the add-on's name and logo, from its manifest.
- Select a channel to play it in the Piume player. If a stream does not play, the player tries the next stream.
- The cards show the program on now, if the add-on gives it.
- Piume reads the channels of each add-on again every 15 minutes.
- The backup includes the add-ons.
- Piume is larger: about 1.2 MB. The player needs the extra space.

## 4.0.0-beta.7

- This version is a beta. To get betas as updates, turn on **Piume settings → Updates → Receive betas**.
- When a channel loads, the player shows its logo and name in the middle of the screen. Below them it shows **Loading stream 1 of 3**, when the channel has more than one stream. If a stream does not work, the player tries the next one automatically. If no stream works, it shows **No stream available**.
- The player banner has the buttons **Audio**, **Subtitles** and **Stream**. While the banner shows, press Left or Right to go to them, then OK to open the list and choose. When the banner is not shown, Left and Right change the stream as before.
- Hold OK (or press Menu) to see the audio tracks and the subtitles together. The banner shows which ones play. Piume remembers the languages you choose for the next channels. The audio and subtitles keys of the remote also work.
- The player shows subtitles, also the picture subtitles that many IPTV streams have.
- In the player, the banner shows only the program on now and the stream. Press OK again to see the full description and what is next.
- In the player, Right no longer closes the player when the other stream does not work. The player tries the next stream, also the ones before it.
- In **Stremio add-ons**, select an add-on and then **Move up** or **Move down** to change the order. In the TV app and the IPTV app, the rows of the first add-on show first.
- The rows of a large IPTV add-on no longer stop the other apps. Before, while Piume loaded them, no app showed its rows.
- Piume keeps the rows of an add-on. When you go back to its tile, they show at once. Before, Piume loaded them again each time.
- Rows far down get their cards when you come near them. With many categories, the home screen stays smooth.
- Piume reads each add-on with fewer requests and keeps less on the TV.
- Logos and what is on come from the add-on first. Piume uses the logos from iptv-org and your TV guide only when the add-on has none, or when its logo does not load.
- In the player, CH+ and CH- (or Up and Down) go to the next and previous channel of the row. You can also type the channel number, or press the Last channel key.
- In the player, Left and Right change to another stream of the same channel. A stream that stops or does not start goes to the next stream automatically.
- In the player, OK or Info shows the channel's logo, its number in the row, the time, the program on now with a progress bar, what is next and the stream.
- The channel you watched last shows in **Continue Playing**. Select the tile of an add-on (or the IPTV app) to watch it again.
- Search finds the channels of the add-ons too, in the same row as the TV channels. It works also without a TMDB key.
- Hold OK on a channel of an add-on and select **Details** to see what the add-on tells about it.
- The row **Continue Watching** is now called **Continue Playing**, because it also shows music and other things that play.
- Piume settings have a new section, **Stremio add-ons**. Select **Add an add-on** and type the address of the add-on's manifest. You can also paste it on your phone.
- The TV channels of an add-on show as rows. The first row has all the channels. Then each category has a row of its own.
- Select **TV channels** to choose where the rows show: **In the TV app**, **In an IPTV app** or **An app per add-on**. Without a TV app, they show in the IPTV app.
- An app per add-on has the add-on's name and logo, from its manifest.
- Select a channel to play it in the Piume player. If a stream does not play, the player tries the next stream.
- The cards show the program on now, if the add-on gives it.
- Piume reads the channels of each add-on again every 15 minutes.
- The backup includes the add-ons.
- Piume is larger: about 1.2 MB. The player needs the extra space.

## 4.0.0-beta.6

- This version is a beta. To get betas as updates, turn on **Piume settings → Updates → Receive betas**.
- The player banner has the buttons **Audio**, **Subtitles** and **Stream**. While the banner shows, press Left or Right to go to them, then OK to open the list and choose. When the banner is not shown, Left and Right change the stream as before.
- Hold OK (or press Menu) to see the audio tracks and the subtitles together. The banner shows which ones play. Piume remembers the languages you choose for the next channels. The audio and subtitles keys of the remote also work.
- The player shows subtitles, also the picture subtitles that many IPTV streams have.
- In the player, the banner shows only the program on now and the stream. Press OK again to see the full description and what is next.
- In the player, Right no longer closes the player when the other stream does not work. The player tries the next stream, also the ones before it.
- In **Stremio add-ons**, select an add-on and then **Move up** or **Move down** to change the order. In the TV app and the IPTV app, the rows of the first add-on show first.
- The rows of a large IPTV add-on no longer stop the other apps. Before, while Piume loaded them, no app showed its rows.
- Piume keeps the rows of an add-on. When you go back to its tile, they show at once. Before, Piume loaded them again each time.
- Rows far down get their cards when you come near them. With many categories, the home screen stays smooth.
- Piume reads each add-on with fewer requests and keeps less on the TV.
- Logos and what is on come from the add-on first. Piume uses the logos from iptv-org and your TV guide only when the add-on has none, or when its logo does not load.
- In the player, CH+ and CH- (or Up and Down) go to the next and previous channel of the row. You can also type the channel number, or press the Last channel key.
- In the player, Left and Right change to another stream of the same channel. A stream that stops or does not start goes to the next stream automatically.
- In the player, OK or Info shows the channel's logo, its number in the row, the time, the program on now with a progress bar, what is next and the stream.
- The channel you watched last shows in **Continue Playing**. Select the tile of an add-on (or the IPTV app) to watch it again.
- Search finds the channels of the add-ons too, in the same row as the TV channels. It works also without a TMDB key.
- Hold OK on a channel of an add-on and select **Details** to see what the add-on tells about it.
- The row **Continue Watching** is now called **Continue Playing**, because it also shows music and other things that play.
- Piume settings have a new section, **Stremio add-ons**. Select **Add an add-on** and type the address of the add-on's manifest. You can also paste it on your phone.
- The TV channels of an add-on show as rows. The first row has all the channels. Then each category has a row of its own.
- Select **TV channels** to choose where the rows show: **In the TV app**, **In an IPTV app** or **An app per add-on**. Without a TV app, they show in the IPTV app.
- An app per add-on has the add-on's name and logo, from its manifest.
- Select a channel to play it in the Piume player. If a stream does not play, the player tries the next stream.
- The cards show the program on now, if the add-on gives it.
- Piume reads the channels of each add-on again every 15 minutes.
- The backup includes the add-ons.
- Piume is larger: about 1.2 MB. The player needs the extra space.

## 4.0.0-beta.5

- This version is a beta. To get betas as updates, turn on **Piume settings → Updates → Receive betas**.
- In the player, the banner shows only the program on now and the stream. Press OK again to see the full description and what is next.
- In the player, Right no longer closes the player when the other stream does not work. The player tries the next stream, also the ones before it.
- In **Stremio add-ons**, select an add-on and then **Move up** or **Move down** to change the order. In the TV app and the IPTV app, the rows of the first add-on show first.
- The rows of a large IPTV add-on no longer stop the other apps. Before, while Piume loaded them, no app showed its rows.
- Piume keeps the rows of an add-on. When you go back to its tile, they show at once. Before, Piume loaded them again each time.
- Rows far down get their cards when you come near them. With many categories, the home screen stays smooth.
- Piume reads each add-on with fewer requests and keeps less on the TV.
- Logos and what is on come from the add-on first. Piume uses the logos from iptv-org and your TV guide only when the add-on has none, or when its logo does not load.
- In the player, CH+ and CH- (or Up and Down) go to the next and previous channel of the row. You can also type the channel number, or press the Last channel key.
- In the player, Left and Right change to another stream of the same channel. A stream that stops or does not start goes to the next stream automatically.
- In the player, OK or Info shows the channel's logo, its number in the row, the time, the program on now with a progress bar, what is next and the stream.
- The channel you watched last shows in **Continue Playing**. Select the tile of an add-on (or the IPTV app) to watch it again.
- Search finds the channels of the add-ons too, in the same row as the TV channels. It works also without a TMDB key.
- Hold OK on a channel of an add-on and select **Details** to see what the add-on tells about it.
- The row **Continue Watching** is now called **Continue Playing**, because it also shows music and other things that play.
- Piume settings have a new section, **Stremio add-ons**. Select **Add an add-on** and type the address of the add-on's manifest. You can also paste it on your phone.
- The TV channels of an add-on show as rows. The first row has all the channels. Then each category has a row of its own.
- Select **TV channels** to choose where the rows show: **In the TV app**, **In an IPTV app** or **An app per add-on**. Without a TV app, they show in the IPTV app.
- An app per add-on has the add-on's name and logo, from its manifest.
- Select a channel to play it in the Piume player. If a stream does not play, the player tries the next stream.
- The cards show the program on now, if the add-on gives it.
- Piume reads the channels of each add-on again every 15 minutes.
- The backup includes the add-ons.
- Piume is larger: about 1.2 MB. The player needs the extra space.

## 4.0.0-beta.4

- This version is a beta. To get betas as updates, turn on **Piume settings → Updates → Receive betas**.
- The rows of a large IPTV add-on no longer stop the other apps. Before, while Piume loaded them, no app showed its rows.
- Piume keeps the rows of an add-on. When you go back to its tile, they show at once. Before, Piume loaded them again each time.
- Rows far down get their cards when you come near them. With many categories, the home screen stays smooth.
- Piume reads each add-on with fewer requests and keeps less on the TV.
- Logos and what is on come from the add-on first. Piume uses the logos from iptv-org and your TV guide only when the add-on has none, or when its logo does not load.
- In the player, CH+ and CH- (or Up and Down) go to the next and previous channel of the row. You can also type the channel number, or press the Last channel key.
- In the player, Left and Right change to another stream of the same channel. A stream that stops or does not start goes to the next stream automatically.
- In the player, OK or Info shows the channel's logo, its number in the row, the time, the program on now with a progress bar, what is next and the stream.
- The channel you watched last shows in **Continue Playing**. Select the tile of an add-on (or the IPTV app) to watch it again.
- Search finds the channels of the add-ons too, in the same row as the TV channels. It works also without a TMDB key.
- Hold OK on a channel of an add-on and select **Details** to see what the add-on tells about it.
- The row **Continue Watching** is now called **Continue Playing**, because it also shows music and other things that play.
- Piume settings have a new section, **Stremio add-ons**. Select **Add an add-on** and type the address of the add-on's manifest. You can also paste it on your phone.
- The TV channels of an add-on show as rows. The first row has all the channels. Then each category has a row of its own.
- Select **TV channels** to choose where the rows show: **In the TV app**, **In an IPTV app** or **An app per add-on**. Without a TV app, they show in the IPTV app.
- An app per add-on has the add-on's name and logo, from its manifest.
- Select a channel to play it in the Piume player. If a stream does not play, the player tries the next stream.
- The cards show the program on now, if the add-on gives it.
- Piume reads the channels of each add-on again every 15 minutes.
- The backup includes the add-ons.
- Piume is larger: about 1.2 MB. The player needs the extra space.

## 4.0.0-beta.3

- This version is a beta. To get betas as updates, turn on **Piume settings → Updates → Receive betas**.
- Logos and what is on come from the add-on first. Piume uses the logos from iptv-org and your TV guide only when the add-on has none, or when its logo does not load.
- In the player, CH+ and CH- (or Up and Down) go to the next and previous channel of the row. You can also type the channel number, or press the Last channel key.
- In the player, Left and Right change to another stream of the same channel. A stream that stops or does not start goes to the next stream automatically.
- In the player, OK or Info shows the channel's logo, its number in the row, the time, the program on now with a progress bar, what is next and the stream.
- The channel you watched last shows in **Continue Playing**. Select the tile of an add-on (or the IPTV app) to watch it again.
- Search finds the channels of the add-ons too, in the same row as the TV channels. It works also without a TMDB key.
- Hold OK on a channel of an add-on and select **Details** to see what the add-on tells about it.
- The row **Continue Watching** is now called **Continue Playing**, because it also shows music and other things that play.
- Piume settings have a new section, **Stremio add-ons**. Select **Add an add-on** and type the address of the add-on's manifest. You can also paste it on your phone.
- The TV channels of an add-on show as rows. The first row has all the channels. Then each category has a row of its own.
- Select **TV channels** to choose where the rows show: **In the TV app**, **In an IPTV app** or **An app per add-on**. Without a TV app, they show in the IPTV app.
- An app per add-on has the add-on's name and logo, from its manifest.
- Select a channel to play it in the Piume player. If a stream does not play, the player tries the next stream.
- The cards show the program on now, if the add-on gives it.
- Piume reads the channels of each add-on again every 15 minutes.
- The backup includes the add-ons.
- Piume is larger: about 1.2 MB. The player needs the extra space.

## 4.0.0-beta.2

- This version is a beta. To get betas as updates, turn on **Piume settings → Updates → Receive betas**.
- Piume settings have a new section, **Stremio add-ons**. Select **Add an add-on** and type the address of the add-on's manifest. You can also paste it on your phone.
- The TV channels of an add-on show as rows. The first row has all the channels. Then each category has a row of its own.
- Select **TV channels** to choose where the rows show: **In the TV app**, **In an IPTV app** or **An app per add-on**. Without a TV app, they show in the IPTV app.
- An app per add-on has the add-on's name and logo, from its manifest.
- Select a channel to play it in the Piume player. If a stream does not play, the player tries the next stream.
- The cards show the program on now, if the add-on gives it.
- Piume reads the channels of each add-on again every 15 minutes.
- The backup includes the add-ons.
- Piume is larger: about 1.2 MB. The player needs the extra space.

## 4.0.0-beta.1

- This version is a beta. Piume does not offer it as an update. To try it, install Piume.apk by hand.
- Piume settings have a new section, **Stremio add-ons**. Select **Add an add-on** and type the address of the add-on's manifest. You can also paste it on your phone.
- The TV channels of an add-on show as rows. The first row has all the channels. Then each category has a row of its own.
- Select **TV channels** to choose where the rows show: **In the TV app**, **In an IPTV app** or **An app per add-on**. Without a TV app, they show in the IPTV app.
- An app per add-on has the add-on's name and logo, from its manifest.
- Select a channel to play it in the Piume player. If a stream does not play, the player tries the next stream.
- The cards show the program on now, if the add-on gives it.
- Piume reads the channels of each add-on again every 15 minutes.
- The backup includes the add-ons.
- Piume is larger: about 1.2 MB. The player needs the extra space.

## 3.1.1

- **Piume settings → Updates** has a new option, **Receive betas**. Turn it on to get the beta versions too. A beta has new functions that are not fully tested yet.
- Piume now knows that a beta comes before its final version. After a beta, Piume offers the final version when it is available.

## 3.1

- The settings section **Continue Watching** is now called **Content**.
- Hold OK on a card: **Remove from this section** replaces **Remove from Continue Watching**, because it works in every section. After it, the same section shows again. Before, the home screen went back to Continue Watching.
- Hold OK on a TV channel and select **Details** to see its page: the logo, the program on now with its time and description, what is next, and **Watch on TV**. It is the same page that search shows.
- In **All apps**, an app in the first or last column shows all of its tile when it has the focus. Before, its edge was cut.
- Piume settings have a new section, **TV & IPTV**. It has the TV inputs, the channel logos and the TV guide. Before, they were in **Favourites** and **Continue Watching**.
- What is playing now shows in the **Continue Watching** row, before the shows. It is no longer a row of its own.
- Hold OK on a playing item and select **Close** to stop it and remove it from the row. It comes back when it plays again.
- A track that stays paused for more than 6 hours goes from the row automatically.
- On Android 8.0, Piume no longer stops when it checks if it can see what is playing.

## 3.0.6

- **Playing now** changes when the track changes, also with apps like Spotify that do not tell other apps about it.

## 3.0.5

- The first row of **Play queue** is called **Playing now** again. Before, it was sometimes called **Continue Watching**.

## 3.0.4

- **Playing now** needs notification access, and only the system can give it. Select **Piume settings → Continue Watching → Show what's playing** to see if Piume has it. If not, the page shows the adb command to run once. The Home button setup shows it too.
- Pictures that are not wide, like the square Spotify covers, show whole on a blur of themselves and fill the card.
- In Piume settings, the TV inputs options say **Favourites** like the rest.

## 3.0.3

- The TV inputs button in the top bar shows a green dot when at least one input has an active device.

## 3.0.2

- In the TV inputs menu, only inputs with an active device or signal show the green dot.
- Fix selected row icon visibility in the TV inputs menu.
- New option to show connected TV inputs in your Favourites even in menu mode (**Piume settings → Favourites → Show connected inputs in Favourites**).

## 3.0.1

- Choose how to show TV inputs: as a menu in the top bar or as tiles in your Favourites (**Piume settings → Favourites → TV inputs**).
- TV inputs show dedicated brand marks for PlayStation, Xbox, Nintendo Switch, Apple TV, set-top boxes, and media players.
- The TV inputs popup menu now matches the current theme and has smoked glass styling in the Glass theme.
- Fixed the updates page staying stuck until reopened when a new version is found.
- The TV guide cache now stays for up to 24 hours between refreshes.

## 3.0.0

- The first tile is now **Play queue**. Its first row, **Playing now**, shows what plays now in any app, like Spotify or YouTube, with the art and the progress. Select a card to open that app. **Continue Watching** comes under it.
- The apps row is now called **Favourites**, in the home screen and in Piume settings.
- Piume is now in Spanish and in French.
- The network icon shows a red dot when there is no internet.
- The Piume settings icon shows a red dot only when an update is ready. The dot also shows on **System** and on **Updates**, so it leads you to the update.
- Some Italian texts are corrected.

## 2.9.4

- The green dots of the TV inputs show only the inputs with a device connected. Piume reads the state from Android. On Sony TVs, Android marks all HDMI inputs as connected, so Piume reads the state from the Sony inputs app instead. On other TVs, the dots are as correct as the state that the TV gives to Android.

## 2.9.3

- In the TV inputs menu, a green dot shows next to each input with a device that is connected and on.
- On the TV channel cards, a long program title scrolls when the card has the focus.

## 2.9.2

- The TV inputs button in the top bar shows a green dot when a device on HDMI is connected and on.

## 2.9.1

- The TV channels show at once, with their names and numbers. The logos come one by one as they load, and the program that is on now comes last.

## 2.9

- Spotlight can show more TMDB lists: trending this week, popular, top rated, films now in cinemas, films coming soon and series on the air. Select **Piume settings → TMDB Spotlight → Spotlight shows**.
- **My TMDB list** is selected only after you set a list. If you do not set one, Spotlight keeps what it showed before.

## 2.8.2

- Search results show at once. Their covers with the title come a moment later, in their place.
- The rows show 10 cards at a time. When you move near the end of a row, the next 10 cards come.
- The TV app shows all the channels, not only the first 30.
- Piume keeps the channel logos on the TV. It downloads them again only each month, or when you select **Update the channel logos**.

## 2.8.1

- Search results show in three rows: films, series, then TV channels. Each card shows the year and the genre.

## 2.8

- Search also finds the TV channels, by name or by number. They show in a row of their own, after the films and series.
- Press OK on a channel to see its page: the logo, the program that is on now with its time and description, and the next program. Select **Watch on TV** to open the channel.

## 2.7.2

- Piume also finds channels in a TV guide by their guide ID, like "Rai1.it" or "Canale.5.it".

## 2.7.1

- Piume finds more channels in TV guides that put the country before the name, like "IT - Canale 5".
- When a TV guide has no programs for today, Piume tells you that the guide is not up to date.

## 2.7

- The TV channel cards can show the program that is on now from a TV guide on the internet. Many TVs do not let apps read their own guide.
- To set the guide, select **Piume settings → Continue Watching → TV guide (XMLTV)**. Type the address of a guide in XMLTV format, or paste it on your phone with the QR code. Piume downloads the guide two times each day.

## 2.6.3

- More channel logos load, for example Rete 4 and Italia 1. Piume now says who it is when it downloads pictures.

## 2.6.2

- Small changes to help find problems with the TV guide.

## 2.6.1

- The program that is on now shows on the TV channel cards. In 2.6 the TV did not give it to Piume.

## 2.6

- The TV channel cards show the program that is on now, after the channel number. The bar under the card shows how far into the program you are. The guide comes from the TV.
- Channels that the TV lists two times show one time only.
- More channels get their logo. Piume finds names like "TELEAMBIENTE" for "TeleAmbiente TV" and "Mediaset Italia2" for "Italia 2". It also uses the logos that iptv-org has only as SVG on Wikimedia.
- When you go back from an app, the home screen shows where you left it. The Home key still goes back to the start of the apps row.

## 2.5.1

- The blurred background of the channel cards and of the search results is smoother.

## 2.5

- The TV channel cards show the logo of the channel, large in the middle on a blur of itself. The name and the number of the channel are under the card.
- When the TV has no logo for a channel, Piume gets it from iptv-org, a public list of TV channels. Piume downloads the list for your country the first time and then each month.
- To turn this off, select **Piume settings → Continue Watching → Channel logos (iptv-org)**. To get the latest logos now, select **Update the channel logos**.

## 2.4.13

- Search results without a picture on TMDB now show the poster or the name of the title. Before, their card was empty.

## 2.4.12

- Every search result fills its card with a picture. When TMDB has no wide picture, the card shows the poster on a blur of itself. When TMDB has no picture at all, the card shows the logo or the name of the title on a colour.
- The arrows of the rows are level with the middle of the tiles and the cards.

## 2.4.11

- The arrows at the sides of the rows and of Spotlight are smaller.
- When you go down from the apps row to the recommendations, the arrows of the apps row go away.
- The Piume settings pages show only the arrow at the bottom, while there are more items below. The arrow at the top is gone.

## 2.4.10

- In Piume settings, each section shows an arrow instead of a value. The arrow tells you that the section opens a page.

## 2.4.9

- Arrows show at the sides of the apps row and of the recommendation rows when there are more items that way. They show only on the row that has the focus.
- The Spotlight arrows show only when Spotlight has the focus.
- An arrow shows at the bottom of the Piume settings pages when the page has more items below.
- In the Glass theme, the edges of the cards and of the Spotlight buttons are thinner and softer.
- In the Glass theme, the side page (Piume settings, search, the page of a result) is smoked glass over the home screen.
- On the page of a search result, the first item stays in full view when you go back up to it.

## 2.4.8

- On the page of a search result, the description shows again when you go back up to the first item.
- The description lines up with the title of the page.

## 2.4.7

- The cover on the page of a search result now reaches the edges of the page and the top of the screen.

## 2.4.6

- On the page of a search result, the cover is at the very top, above the title. It fills the full width of the page.

## 2.4.5

- The page of a search result shows its wide cover at the top, with the text under it.
- Each app on that page shows its icon next to its name.

## 2.4.4

- Search results are wide covers with the title on them, in the language that you set for TMDB, or else in English. When TMDB has no such cover, the card shows the logo of the title on the picture.
- Pictures in the recommendations, like the YouTube ones, fill the card. They have no black bars.

## 2.4.3

- **YouTube trailer** is the first button in Spotlight and the first item on the page of a search result.

## 2.4.2

- When the Spotlight title has the focus, a soft band goes across the full screen behind it. It has no border.
- The Spotlight description uses all the width of the screen.

## 2.4.1

- The keyboard closes when you search, and when you close a page of Piume settings.

## 2.4

- Search results no longer replace Spotlight. A **Results** tile shows after **Continue Watching**, with the results as cards under the apps row.
- Press OK on a result to see its description, the YouTube trailer and the apps that have it.
- Press Back, or hold OK on the **Results** tile, to close the search.
- **Say it** listens in the search page. The words show in the search box while you speak. The first time, allow Piume to use the microphone.
- In the search page, Down goes from the search box to **Say it**.
- The Spotlight title shows a soft panel when it has the focus.
- The pages that open on your phone from a QR code show the name of the TV at the bottom.

## 2.3

- The top bar has a **Search** button with a magnifying glass. Type a title with the remote, say it, or type it on your phone with the QR code.
- Search finds films and series on TMDB. Spotlight shows the results, with the description, the trailer and the apps that have the title. Press Back to close the search.
- Hold OK on **Search** to open the voice assistant of the TV.
- When you move along the apps row, empty cards show while the recommendations of the app load. The cards of the previous app do not stay on the screen.
- From the apps row, Up goes to the Spotlight buttons first, then to the title, then to the top bar.

## 2.2

- The new **Glass** theme shows the wallpaper through glossy glass cards. The text is white and easy to read on any photo. Select **Piume settings → Appearance & wallpapers → Theme → Glass**. It uses the dark wallpaper.

## 2.1

- In Piume settings, a long value no longer cuts the name of the setting. The value is shorter instead.
- Each row that an app shows on the home screen is now a section under the apps row. For example, YouTube shows **Recommended** and **Trending** as two rows. Move down to see the next section.
- To select the sections of an app, hold OK on the app and select **Visible sections**.
- The TV app shows all the channels of the TV, from channel 1, in number order. Each tuner is a section. All channel cards have the same design on all TVs.
- On a TV without a tuner, the TV app shows no channels.
- Spotlight does not change the title while the title or its buttons have the focus.
- Press OK on the Spotlight title to show all of a long description. Press OK again to make it short.
- The Spotlight title is a little higher. The space above it and the space below it are the same.
- The first and the last item of a row now show all of their shadow when they have the focus.

## 2.0

- The Spotlight image is clearer. It has a fade only under the apps row. The Spotlight text has no panel behind it. It has the same soft shadow as the clock.
- Spotlight can show your own list from themoviedb.org instead of the trending titles. Make a public list there, then select **Piume settings → TMDB Spotlight → My TMDB list** and paste its link on your phone.
- The Gallery screensaver can show the Spotlight trending images, with the title, the year and the genre. Select **Piume settings → Screensaver → Screensaver → Spotlight trending (TMDB)**.
- The top bar has a voice search button. It opens the voice search of the TV.
- You can show the clock in 24-hour or 12-hour format. Select **Piume settings → Appearance & wallpapers → Clock**.
- **Night mode** makes the home screen darker and stops Spotlight between the hours you choose. Turn it on in **Piume settings → Appearance & wallpapers → Night mode**.
- You can save a backup of your Piume settings on your phone and restore it later. Select **Piume settings → System → Backup and restore**. The backup has your TMDB key, but not your photos or the lock PIN.

## 1.5

- Spotlight keeps its images on the TV. It downloads each image one time, not each time it shows the title.
- Spotlight gets the next image before it shows it. The next title appears without a wait.
- Spotlight shows the trending titles in a random order.
- Spotlight stops after 15 minutes without a key press. Press a key to start it again.
- Security: other apps cannot make Piume start their apps through the update screen.
- Security: a card in Continue Watching can only open the app that added it.
- Security: Android no longer copies Piume settings and your TMDB key to backups.
- You can enter your TMDB API key from your phone. Select **Piume settings → TMDB Spotlight → TMDB API Key → Enter from your phone**, then scan the code. Piume checks the key with TMDB.
- Security: the phone code for wallpapers and the TMDB key is now long and random. Other people on your Wi-Fi cannot guess it.
- The phone pages are in the language of the TV.
- Spotlight shows a streaming service only if the title is on it in your country. Nuvio, Stremio and YouTube trailer always show. To show all the services, turn off **Piume settings → TMDB Spotlight → Only services that have the title**.
- **Piume settings → System → Recent problems** shows the last things that did not work, for example a failed download. You can read them on your phone too.
- The automatic theme waits until you stop using the TV before it changes.
- Updates and weather downloads no longer slow down the rows.

## 1.4

- Plume Launcher is now Piume, a fork by mccoy88f. Piume installs next to Plume and updates from its own releases.
- You can set the weather location by hand. Select **Piume settings → Appearance & wallpapers → Weather location**.
- **Piume settings → System → Home button** is now a switch. Use it to turn the Home button on or off.
- All the text in Piume is now in one file. This makes translation easier.
- Piume is now in Italian. It uses the language of the TV.
- A guided setup makes the Home button open Piume. To do it again, select **Piume settings → System → Set up Home button**.
- A red dot on the Piume settings icon tells you about a new update or new update notes.
- **Piume settings → System → Updates** shows what is new in this version.
- You can put a short app row on the left, in the centre or on the right. Select **Piume settings → Apps row → App row position**.
- Piume settings are now in groups. Select a group to see its settings.
- The top bar has a TV inputs button. Use it to change to an HDMI input.
- **TMDB Spotlight** shows trending films and series above the apps row. Add your TMDB API key in **Piume settings → TMDB Spotlight**.
- Spotlight goes to the next title every 5 seconds. Select **Piume settings → TMDB Spotlight → Next title every** to change the time.
- Use ◀ and ▶ on Spotlight to go to the previous or next title.
- Select an app under Spotlight to open the title in that app. Nuvio and Stremio open the title page.
- **YouTube trailer** under Spotlight plays the trailer from TMDB in your TMDB language. If TMDB has no trailer, it searches YouTube.
- Focused items are easier to see in the light theme and in the dark theme.
- An app with no recommendations shows nothing under the apps row.
- Recommended TV channels are in channel number order.
- Channel cards from a TV app show all of the card. The name on the card does not touch the border.
- When the focused item is below the bottom of the screen, the home screen moves up to show it.
- The TMDB Spotlight image is easier to see. It has less shade at the top and at the bottom.
- Fix: on Android 8.0 and 8.1, the home screen closed when it started.
# Plume Launcher releases

These are the releases of Plume Launcher by aradhyas8, before the fork.

## 1.3

- You can use a folder of photos as your wallpaper. The folder can be on the TV or on a USB drive. Select **Plume settings → Folder photo changes** to set how often the photo changes.
- **Photo fade** removes the dark area at the bottom of your photos.
- You can use your photos as the screensaver. Select **Plume settings → Screensaver → Your photos**.
- **Lock layout** keeps the home screen safe from changes. Set a 4-digit PIN in **Plume settings → Lock layout**. Apps still open without the PIN.
- Hold OK on an app to show **Move**, **Remove from row** and **App info**.
- Hold OK on a Continue Watching card to show **Remove** and **Open app**.
- Continue Watching shows a maximum of three shows from each app.
- **Launcher settings** is now **Plume settings**. Back goes up one page.
- **Remove a photo…** deletes wallpapers that you uploaded.
- The Home button switch opens the correct settings screen on more TVs.

## 1.2.1

- Fix: with **Icon style → Colour**, some app icons stayed grey until Plume started again.

## 1.2

- Plume updates itself. It looks for a new version one time each day. Select **Plume settings → Updates** to install it.
- You can hide apps from the home row. Select **Plume settings → Apps in row**. Hidden apps stay in All apps.
- **App names** shows app names below the tiles: on focus, always or never.
- **Icon style → Colour** shows each logo in the colour of its brand.
- You can add wallpapers from your phone. Select **Add from phone…** in a wallpaper list, then scan the QR code.
- Fix: green areas no longer show in the sky of wallpapers.

## 1.1

- The APK is now 0.4 MB. It was 5.1 MB.
- The Gallery screensaver paintings are now a 4.7 MB download. Select **Plume settings → Screensaver → Gallery** to get them.
- Plume deletes the paintings when you select a different screensaver.
- Fix: Plume did not always find its Home button service.

## 1.0

- First release.

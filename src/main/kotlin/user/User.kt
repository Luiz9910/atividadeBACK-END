package user

data class user (
    var login: String,
    var id: Int,
    var node_id: String,
    var avatar_url: String,
    var html_url: String,
    var followers_url: String,
    var following_url: String,
    var gists_url: String,
    var starred_url: String,
    var subscription_url: String,
    var organization_url: String,
    var respos_url: String,
    var events_url: String,
    var received_events_url: String,
    var type: String,
    var site_adm: Boolean,
    var name: String,
    var company: Int?,
    var Blog: String,
    var location: String,
    var email: String?,
    var hireable: String?,
    var bio: String?,
    var twitter_username: String?,
    var public_repos: Int,
    var public_gists: Int,
    var followes: Int,
    var following: Int,
    var created_at: String,
    var update_at: String
)
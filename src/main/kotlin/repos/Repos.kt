package repos
data class repos (
    var id: Int,
    var node_id: String,
    var name: String,
    var full_name: String,
    var private: Boolean,
    var html_url: String,
    var description: String,
    var fork: Boolean,
    var url: String,
    var forks_url:String,
    var keys_url: String,
    var collaborators_url: String,
    var teams_url: String,
    var hooks_url: String,
    var issues_events_url: String,
    var events_url: String,
    var assignees_url: String,
    var branches_url: String,
    var tags_url: String,
    var blobs_url: String,
    var git_tags_url: String,
    var git_refs_url: String,
    var trees_url: String,
    var statuses_url: String,
    var languages_url: String,
    var stargazers_url: String,
    var contributors_url: String,
    var subscribers_url: String,
    var subscription_url: String,
    var git_commits_url: String,
    var comments_url: String,
    var issues_coments_url: String,
    var contents_url: String,
    var compare_url: String,
    var merges_url: String,
    var archive_url:String,
    var downloads_url: String,
    var issues_url: String,
    var pulls_url: String,
    var milestones_url: String,
    var notifications_url:String,
    var labels_url: String,
    var releases_url: String,
    var deployments_url: String,
    var created_at: String,
    var updated_at: String,
    var git_url: String,
    var ssh_url: String,
    var clone_url: String,
    var svn_url: String,
    var homepage:String,
    var size: Int,
    var stargazers_count: Int,
    var watchers_count: Int,
    var language: String,
    var has_issues: Boolean,
    var has_projects: Boolean,
    var has_downloads: Boolean,
    var forks_count: Int,
    var mirror_url: String,
    var archived: Boolean,
    var disabled: Boolean,
    var open_issues_count: Int,
    var licente: String,
    var allow_forking: String,
    var is_template: Boolean,
    var topics: List<String>,
    var visibility: String,
    var forks: Int,
    var open_issues: Int,
    var watchers: Int,
    var default_branch: String,
    var template_clone_token: String,
    var network_count: Int,
    var subscribers_count: Int
)
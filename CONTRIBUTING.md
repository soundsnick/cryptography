# 👋 Welcome and thanks for contributing!

---
## 📚 History
We prefer to use liner history and because of that
it is very important for you to know how to work with
[`git rebase`](https://git-scm.com/docs/git-rebase).


#### Helpful links about `git rebase`
+ [Merging vs. Rebasing documentation from **Atlassian**](https://www.atlassian.com/git/tutorials/merging-vs-rebasing)
+ [`git rebase` tutorial from **Atlassian**](https://www.atlassian.com/git/tutorials/rewriting-history/git-rebase)
+ [Official documentation](https://git-scm.com/docs/git-rebase)

#### Commit messages
[Conventional Commits 1.0.0](https://www.conventionalcommits.org/en/v1.0.0/)

Summary from **conventionalcommits.org**:
> The Conventional Commits specification is a lightweight convention on top of commit messages.
> It provides an easy set of rules for creating an explicit commit history; which makes it easier
> to write automated tools on top of. This convention dovetails with SemVer, by describing
> the features, fixes, and breaking changes made in commit messages.

**Message structure**:
```
<type>[optional scope]: <description> [task code if exists]

[optional body]

[optional footer(s)]
```

**Type**:

Must be one of the following:

+ **build**: Changes that affect the build system or external dependencies (example scopes: gulp, broccoli, npm)
+ **ci**: Changes to our CI configuration files and scripts (example scopes: Travis, Circle, BrowserStack, SauceLabs)
+ **docs**: Documentation only changes
+ **feat**: A new feature
+ **fix**: A bug fix
+ **perf**: A code change that improves performance
+ **refactor**: A code change that neither fixes a bug nor adds a feature
+ **style**: Changes that do not affect the meaning of the code (white-space, formatting, missing semi-colons, etc)
+ **test**: Adding missing tests or correcting existing tests
+ **revert**: MR/Commit reverts

**Description**
+ must be written using irregular verbs.
+ must describe what does YOUR CODE, but not what YOU DID

Best way to understand if your commit message's good is too create sentence like:
`If applied, will [optional type] <description> [in <scope>]`.

**If applied, will...**
+ add jsdoc in `card`
+ `fix` typo in property name in `theme`
+ display columns in reverse order in `table`

**Examples**:
```
feat: add component Card
docs(ruby): add jsdoc (DI-36)
fix(python): typo in property name (DI-12)
style(go): display columns in reverse order (DI-432)
```

#### Branch naming
```
language: algorithm-name
```
// Title: Edit Distance
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/edit-distance/

                } else {
                    dp[i][j] = 1 + Math.min(
                        dp[i - 1][j - 1], // Replace
                        Math.min(
                            dp[i - 1][j],  // Delete
                            dp[i][j - 1]   // Insert
                        )
                    );
                }
            }
        }

        return dp[m][n];
    }
}

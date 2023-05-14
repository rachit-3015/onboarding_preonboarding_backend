package com.project.jwt;

//@Component
public class JwtAuthenticationFilter /* extends OncePerRequestFilter */ {
	/*
	 * 
	 * @Autowired private JwtUtility jwtUtility;
	 * 
	 * @Autowired private UserDetailsServiceImpl userDetailsServiceImpl;
	 * 
	 * @Override protected void doFilterInternal(HttpServletRequest
	 * httpServletRequest, HttpServletResponse httpServletResponse, FilterChain
	 * filterChain) throws ServletException, IOException { String
	 * authorizationHeader = httpServletRequest.getHeader("Authorization"); String
	 * token = null; String userName = null; try { if (authorizationHeader != null
	 * && authorizationHeader.startsWith("Bearer ")) { token =
	 * authorizationHeader.substring(7); userName =
	 * jwtUtility.extractUsername(token); }
	 * 
	 * if (userName != null &&
	 * SecurityContextHolder.getContext().getAuthentication() == null) {
	 * 
	 * UserDetails userDetails =
	 * userDetailsServiceImpl.loadUserByUsername(userName);
	 * 
	 * if (jwtUtility.validateToken(token, userDetails)) {
	 * 
	 * UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = new
	 * UsernamePasswordAuthenticationToken( userDetails, null,
	 * userDetails.getAuthorities()); usernamePasswordAuthenticationToken
	 * .setDetails(new
	 * WebAuthenticationDetailsSource().buildDetails(httpServletRequest));
	 * SecurityContextHolder.getContext().setAuthentication(
	 * usernamePasswordAuthenticationToken); } }
	 * httpServletResponse.addHeader("Access-Control-Allow-Origin", "*");
	 * httpServletResponse.addHeader("Access-Control-Allow-Credentials", "true");
	 * httpServletResponse.addHeader("Access-Control-Allow-Methods", "*");
	 * httpServletResponse.addHeader("Access-Control-Allow-Headers", "*"); } catch
	 * (ExpiredJwtException ex) { String isRefreshToken =
	 * httpServletRequest.getHeader("isRefreshToken"); String requestURL =
	 * httpServletRequest.getRequestURL().toString(); if (isRefreshToken != null &&
	 * isRefreshToken.equals("true") && requestURL.contains("refreshWebToken")) {
	 * allowForRefreshToken(ex, httpServletRequest); } else
	 * httpServletResponse.sendError(HttpServletResponse.SC_UNAUTHORIZED,
	 * ex.getMessage()); } catch (BadCredentialsException ex) {
	 * httpServletRequest.setAttribute("exception", ex); } catch (Exception ex) {
	 * System.out.println(ex); } if
	 * (!"OPTIONS".equalsIgnoreCase(httpServletRequest.getMethod())) {
	 * filterChain.doFilter(httpServletRequest, httpServletResponse); } }
	 * 
	 * private void allowForRefreshToken(ExpiredJwtException ex, HttpServletRequest
	 * request) { UsernamePasswordAuthenticationToken
	 * usernamePasswordAuthenticationToken = new
	 * UsernamePasswordAuthenticationToken( null, null, null);
	 * SecurityContextHolder.getContext().setAuthentication(
	 * usernamePasswordAuthenticationToken); request.setAttribute("claims",
	 * ex.getClaims()); }
	 */}
